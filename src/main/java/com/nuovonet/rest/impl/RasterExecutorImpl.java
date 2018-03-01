package com.nuovonet.rest.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.nuovonet.rest.RasterExecutor;
import com.nuovonet.rest.model.BaseRequisicao;
import com.nuovonet.rest.model.BaseRetorno;
import com.nuovonet.rest.model.TabelaRetorno;
import com.nuovonet.rest.util.JSONUtils;
import com.nuovonet.rest.util.Propriedades;

public class RasterExecutorImpl implements RasterExecutor {

	Propriedades props = Propriedades.getInstancia();

	public BaseRetorno setPreSM(BaseRequisicao dados) {

		URL url;
		HttpURLConnection conn;
		BufferedReader rd;
		String line;
		String result = "";
		BaseRetorno retorno = null;

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

			if (dados.getAmbiente() == null
					|| dados.getAmbiente().length() == 0)
				dados.setAmbiente(props.getAmbiente());
			if (dados.getLogin() == null || dados.getLogin().length() == 0)
				dados.setLogin(props.getUsuario());// ("87283164001");
			if (dados.getSenha() == null || dados.getSenha().length() == 0)
				dados.setSenha(props.getSenha());// ("B@QyQ*AcI2*s");
			if (dados.getTipoRetorno() == null
					|| dados.getTipoRetorno().length() == 0)
				dados.setTipoRetorno("JSON");

			String msg = new JSONUtils<BaseRequisicao>().getJson(dados);
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

			retorno = new JSONUtils<BaseRetorno>().getObject(
					jResult.toJSONString(), BaseRetorno.class);

			if (jResult.get("MsgErro") != null) {
				System.out.println("-- MsgErro:"
						+ jResult.get("MsgErro").toString());
			} else {
				System.out.println("deu certo?" + retorno.getAmbiente());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return retorno;
	}

	@SuppressWarnings("unchecked")
	public BaseRetorno getPreSM(String codigo) {
		URL url;
		HttpURLConnection conn;
		BufferedReader rd;
		String line;
		String result = "";
		BaseRetorno retorno = null;

		try {
			url = new URL(props.getUrl() + "\"getPreSM\"");
			// System.out.println("URL:"+url.toString());
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
			if (codigo != null && !codigo.equals("null")) {
				msg.put("CodPreSolicitacao", new Integer(codigo));
			}

			System.out.println("msg Output:" + msg.toJSONString());

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

			retorno = new JSONUtils<BaseRetorno>().getObject(
					jResult.toJSONString(), BaseRetorno.class);

			if (jResult.get("MsgErro") != null) {
				System.out.println("-- MsgErro:"
						+ jResult.get("MsgErro").toString());
			} else {
				System.out.println("deu certo?" + retorno.getAmbiente());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return retorno;
	}

	@SuppressWarnings("unchecked")
	public String setCancelaPreSM(String codigo) {
		URL url;
		HttpURLConnection conn;
		BufferedReader rd;
		String line;
		String result = "";
		String toReturn = "";

		try {
			url = new URL(props.getUrl() + "\"setCancelaPreSM\"");
			// System.out.println("URL:"+url.toString());
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
			if (codigo != null && !codigo.equals("null")) {
				msg.put("CodPreSolicitacao", new Integer(codigo));
			}

			System.out.println("msg Output:" + msg.toJSONString());

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
			System.out.println("-- Ambiente:"
					+ jResult.get("Ambiente").toString());
			System.out.println("-- Metodo:" + jResult.get("Metodo").toString());
			System.out.println("-- Login:" + jResult.get("Login").toString());
			System.out.println("-- CodErro:"
					+ jResult.get("CodErro").toString());
			System.out.println("-- PreSM:"
					+ jResult.get("CodPreSolicitacao").toString());
			toReturn = jResult.get("Cancelou").toString();
			System.out.println("-- Cancelou:" + toReturn);

			if (jResult.get("MsgErro") != null) {
				System.out.println("-- MsgErro:"
						+ jResult.get("MsgErro").toString());
				toReturn = "NAO";
			} else {
				System.out.println("deu certo: " + toReturn);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return toReturn;
	}

	@SuppressWarnings("unchecked")
	public TabelaRetorno getTabela(String nomeTabela) {
		URL url;
		HttpURLConnection conn;
		BufferedReader rd;
		String line;
		String result = "";
		TabelaRetorno retorno = null;

		try {
			url = new URL(props.getUrl() + "\"getTabela\"");
			// System.out.println("URL:"+url.toString());
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
			msg.put("NomeTabela", nomeTabela);

			System.out.println("msg Output:" + msg.toJSONString());

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

			retorno = new JSONUtils<TabelaRetorno>().getObject(
					jResult.toJSONString(), TabelaRetorno.class);

			if (jResult.get("MsgErro") != null) {
				System.out.println("-- MsgErro:"
						+ jResult.get("MsgErro").toString());
			} else {
				System.out.println("deu certo?" + retorno.getAmbiente());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return retorno;
	}

	@SuppressWarnings("unchecked")
	public BaseRetorno getPosicoes(String tipoConsulta, String codUltimaPosicao) {

		URL url;
		HttpURLConnection conn;
		BufferedReader rd;
		String line;
		String result = "";
		BaseRetorno retorno = null;

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
			msg.put("Ambiente", props.getAmbiente());
			msg.put("Login", props.getUsuario());
			msg.put("Senha", props.getSenha());
			msg.put("TipoRetorno", "JSON");
			msg.put("TipoConsulta", (tipoConsulta != null && tipoConsulta
					.length() > 0) ? tipoConsulta : "Ultimas");

			if (codUltimaPosicao != null && codUltimaPosicao.length() > 0)
				msg.put("CodUltPosicao", codUltimaPosicao); // ou "0"

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

			retorno = new JSONUtils<BaseRetorno>().getObject(
					jResult.toJSONString(), BaseRetorno.class);

			if (jResult.get("MsgErro") != null) {
				System.out.println("-- MsgErro:"
						+ jResult.get("MsgErro").toString());
			} else {
				System.out.println("deu certo?" + retorno.getAmbiente());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return retorno;
	}
	
	@SuppressWarnings("unchecked")
	public BaseRetorno getMensagens(String tipoConsulta, String codUltimaMensagem) {

		URL url;
		HttpURLConnection conn;
		BufferedReader rd;
		String line;
		String result = "";
		BaseRetorno retorno = null;

		try {

			url = new URL(props.getUrl() + "\"getMensagens\"");

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
			msg.put("TipoConsulta", (tipoConsulta != null && tipoConsulta
					.length() > 0) ? tipoConsulta : "Proximas");

			if (codUltimaMensagem != null && codUltimaMensagem.length() > 0)
				msg.put("CodUltMensagem", codUltimaMensagem); // ou "0"

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

			retorno = new JSONUtils<BaseRetorno>().getObject(
					jResult.toJSONString(), BaseRetorno.class);

			if (jResult.get("MsgErro") != null) {
				System.out.println("-- MsgErro:"
						+ jResult.get("MsgErro").toString());
			} else {
				System.out.println("deu certo?" + retorno.getAmbiente());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return retorno;
	}

}
