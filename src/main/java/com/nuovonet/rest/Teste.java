package com.nuovonet.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.nuovonet.rest.impl.RasterExecutorImpl;
import com.nuovonet.rest.model.BaseRequisicao;
import com.nuovonet.rest.model.BaseRetorno;
import com.nuovonet.rest.model.Mensagem;
import com.nuovonet.rest.model.Posicao;
import com.nuovonet.rest.model.TabelaRetorno;
import com.nuovonet.rest.util.JSONUtils;
import com.nuovonet.rest.util.Propriedades;

@SuppressWarnings("unchecked")
public class Teste {

	public static void main(String[] args) {
		// TODO Teste de conexao

		// testaRest();
		RasterExecutor rasterExecutor = new RasterExecutorImpl();
		// BaseRetorno retorno = rasterExecutor.setPreSM(new
		// DadosTeste().montaDados());
		// System.out.println("deu certo?"+retorno.getAmbiente()+"|"+retorno.getMetodo());
		// TabelaRetorno ret = rasterExecutor.getTabela("PRODUTOS");
//		testaPosicao();
		BaseRetorno retorno = rasterExecutor.getPosicoes(null,null);
		System.out.println("Ambiente:" + retorno.getAmbiente() + "|Método:"
				+ retorno.getMetodo());
		if (retorno.getPosicoes() != null)
			for (Posicao msg : retorno.getPosicoes()) {
				System.out
						.println("--------------------------------------------------------------------------------");
				System.out.println(new JSONUtils<Posicao>()
						.getJson(msg));
				System.out
						.println("--------------------------------------------------------------------------------");
			}
	}

	public static void testaRest() {

		Propriedades props = Propriedades.getInstancia();
		URL url;
		HttpURLConnection conn;
		BufferedReader rd;
		String line;
		String result = "";

		try {
			url = new URL(props.getUrl() + "\"getPreSM\"");

			conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			conn.setRequestProperty("Content-Type", "text/plain;charset=UTF-8");
			conn.setRequestProperty("Accept", "application/JSON");
			conn.setRequestMethod("POST");

			JSONObject msg = new JSONObject();
			msg.put("Ambiente", props.getAmbiente());
			msg.put("Login", props.getUsuario());
			msg.put("Senha", props.getSenha());
			msg.put("TipoRetorno", "JSON");
			// msg.put("TipoConsulta", "Ultimas");
			msg.put("CodPreSolicitacao", 120105);
			// msg.put("NomeTabela", "PERFIL_SEGURANCA");

			// JSONObject msgInner = new JSONObject();
			// msgInner.put("CodFilial", 1110);
			// msgInner.put("PlacaVeiculo", "KHM3379");
			// msgInner.put("CPFMotorista1", "31746019832");
			// msg.put("Engate", msgInner);

			System.out.println("msg Output:" + msg.toString());

			OutputStream os = conn.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			osw.write(msg.toJSONString());
			osw.flush();
			osw.close();
			rd = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			while ((line = rd.readLine()) != null) {
				result += line;
			}
			rd.close();

			JSONParser parser = new JSONParser();
			Object pars = parser.parse(result);
			JSONObject jObject = (JSONObject) pars;
			JSONArray jArray = (JSONArray) jObject.get("result");
			JSONObject jResult = (JSONObject) jArray.get(0);

			result = jResult.toJSONString();
			System.out.println(">>> Result ---> ");
			System.out.println(result);
			System.out.println(">>> Fim Result --- ");
			// System.out.println("-- Ambiente:" +
			// jResult.get("Ambiente").toString());
			// System.out.println("-- Metodo:" +
			// jResult.get("Metodo").toString());
			// System.out.println("-- Login:" +
			// jResult.get("Login").toString());
			// System.out.println("-- CodErro:" +
			// jResult.get("CodErro").toString());

			if (jResult.get("MsgErro") != null) {
				System.out.println("-- MsgErro:"
						+ jResult.get("MsgErro").toString());
				// BaseRequisicao retorno = new
				// JSONUtils<BaseRequisicao>().getObject(result,
				// BaseRequisicao.class);
				// System.out.println("deu certo?"+retorno.getCodErro());
			} else {
				// Set<Map.Entry<String, String>> keys = jResult.entrySet();
				// for(Map.Entry<String, String> key : keys){
				// System.out.println("-- "+key);
				// }
				JSONArray jArrayPosicoes = (JSONArray) jResult.get("Posicoes");
				if (jArrayPosicoes != null)
					for (int i = 0; i < jArrayPosicoes.size(); i++) {
						JSONObject jResultObj = (JSONObject) jArrayPosicoes
								.get(i);
						System.out.println("Posicao " + i + ":");
						Set<Map.Entry<String, String>> keys = jResultObj
								.entrySet();
						for (Map.Entry<String, String> key : keys) {
							System.out.println("-- " + key);
						}
						if (i == 30)
							break;
					}

			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testaPreSM() {

		Propriedades props = Propriedades.getInstancia();
		URL url;
		HttpURLConnection conn;
		BufferedReader rd;
		String line;
		String result = "";

		try {
			url = new URL(props.getUrl() + "\"setPreSM\"");
			// System.out.println("URL:"+url.toString());
			conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			conn.setRequestProperty("Content-Type", "text/plain;charset=UTF-8");
			conn.setRequestProperty("Accept", "application/JSON");
			conn.setRequestMethod("POST");

			String msg = new DadosTeste().getJson();
			System.out.println("msg Output:" + msg);

			OutputStream os = conn.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			osw.write(msg);
			osw.flush();
			osw.close();
			rd = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			while ((line = rd.readLine()) != null) {
				result += line;
			}
			rd.close();

			JSONParser parser = new JSONParser();
			Object pars = parser.parse(result);
			JSONObject jObject = (JSONObject) pars;
			JSONArray jArray = (JSONArray) jObject.get("result");
			JSONObject jResult = (JSONObject) jArray.get(0);

			result = jResult.toJSONString();
			System.out.println(">>> Result ---> ");
			System.out.println(result);
			System.out.println(">>> Fim Result --- ");
			// System.out.println("-- Ambiente:" +
			// jResult.get("Ambiente").toString());
			// System.out.println("-- Metodo:" +
			// jResult.get("Metodo").toString());
			// System.out.println("-- Login:" +
			// jResult.get("Login").toString());
			// System.out.println("-- CodErro:" +
			// jResult.get("CodErro").toString());

			BaseRetorno retorno = new JSONUtils<BaseRetorno>().getObject(
					jResult.toJSONString(), BaseRetorno.class);
			System.out.println("deu certo?" + retorno.getCodErro());

			if (jResult.get("MsgErro") != null) {
				System.out.println("-- MsgErro:"
						+ jResult.get("MsgErro").toString());
			} else {
				// Set<Map.Entry<String, String>> keys = jResult.entrySet();
				// for(Map.Entry<String, String> key : keys){
				// System.out.println("-- "+key);
				// }
				// JSONArray jArrayPosicoes = (JSONArray)
				// jResult.get("Posicoes");
				// if(jArrayPosicoes != null)
				// for(int i=0; i<jArrayPosicoes.size(); i++) {
				// JSONObject jResultObj = (JSONObject)jArrayPosicoes.get(i);
				// System.out.println("Posicao " + i + ":");
				// Set<Map.Entry<String, String>> keys = jResultObj.entrySet();
				// for(Map.Entry<String, String> key : keys){
				// System.out.println("-- "+key);
				// }
				// if(i == 30)
				// break;
				// }
				//
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void testaPosicao() {

		Propriedades props = Propriedades.getInstancia();
		URL url;
		HttpURLConnection conn;
		BufferedReader rd;
		String line;
		String result = "";

		try {
			url = new URL(props.getUrl() + "\"getPosicoes\"");

			conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			conn.setRequestProperty("Content-Type", "text/plain;charset=UTF-8");
			conn.setRequestProperty("Accept", "application/JSON");
			conn.setRequestMethod("POST");

			JSONObject msg = new JSONObject();
			// msg.put("Ambiente", props.getAmbiente());
			msg.put("Ambiente", "Homologacao");
			msg.put("Login", props.getUsuario());
			msg.put("Senha", props.getSenha());
			msg.put("TipoRetorno", "JSON");
			msg.put("TipoConsulta", "Ultimas");
			// msg.put("CodUltPosicao", "999999999"); // ou "0"

			System.out.println("msg Output:" + msg.toString());

			OutputStream os = conn.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			osw.write(msg.toJSONString());
			osw.flush();
			osw.close();
			rd = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			while ((line = rd.readLine()) != null) {
				result += line;
			}
			rd.close();

			JSONParser parser = new JSONParser();
			Object pars = parser.parse(result);
			JSONObject jObject = (JSONObject) pars;
			JSONArray jArray = (JSONArray) jObject.get("result");
			JSONObject jResult = (JSONObject) jArray.get(0);

			result = jResult.toJSONString();
			System.out.println(">>> Result ---> ");
			System.out.println(result);
			System.out.println(">>> Fim Result --- ");
			// System.out.println("-- Ambiente:" +
			// jResult.get("Ambiente").toString());
			// System.out.println("-- Metodo:" +
			// jResult.get("Metodo").toString());
			// System.out.println("-- Login:" +
			// jResult.get("Login").toString());
			// System.out.println("-- CodErro:" +
			// jResult.get("CodErro").toString());

			BaseRetorno retorno = new JSONUtils<BaseRetorno>().getObject(
					jResult.toJSONString(), BaseRetorno.class);
			System.out.println("deu certo?" + retorno.getCodErro());

			if (jResult.get("MsgErro") != null) {
				System.out.println("-- MsgErro:"
						+ jResult.get("MsgErro").toString());
				// BaseRequisicao retorno = new
				// JSONUtils<BaseRequisicao>().getObject(result,
				// BaseRequisicao.class);
				// System.out.println("deu certo?"+retorno.getCodErro());
			} else {
				// Set<Map.Entry<String, String>> keys = jResult.entrySet();
				// for(Map.Entry<String, String> key : keys){
				// System.out.println("-- "+key);
				// }

				if (retorno.getPosicoes() != null)
					for (Posicao pos : retorno.getPosicoes()) {
						System.out
								.println("--------------------------------------------------------------------------------");
						System.out.println(new JSONUtils<Posicao>()
								.getJson(pos));
						System.out
								.println("--------------------------------------------------------------------------------");
					}

				// JSONArray jArrayPosicoes = (JSONArray)
				// jResult.get("Posicoes");
				// if(jArrayPosicoes != null)
				// for(int i=0; i<jArrayPosicoes.size(); i++) {
				// JSONObject jResultObj = (JSONObject)jArrayPosicoes.get(i);
				// System.out.println("Posicao " + i + ":");
				// Set<Map.Entry<String, String>> keys = jResultObj.entrySet();
				// for(Map.Entry<String, String> key : keys){
				// System.out.println("-- "+key);
				// }
				// if(i == 30)
				// break;
				// }

			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
