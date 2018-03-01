package com.nuovonet.rest;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.nuovonet.rest.model.BaseRequisicao;
import com.nuovonet.rest.model.Cliente;
import com.nuovonet.rest.model.ColetaEntrega;
import com.nuovonet.rest.model.Detalhamento;
import com.nuovonet.rest.model.Documento;
import com.nuovonet.rest.model.Engate;
import com.nuovonet.rest.model.EscoltaArmada;
import com.nuovonet.rest.model.EscoltaVelada;
import com.nuovonet.rest.model.LiberacaoEngate;
import com.nuovonet.rest.model.LocalizadorAvulso;
import com.nuovonet.rest.model.PreSM;
import com.nuovonet.rest.model.Produto;
import com.nuovonet.rest.model.Rota;
import com.nuovonet.rest.util.Propriedades;

public class DadosTeste {
	
	public BaseRequisicao montaDados() {
		
		Propriedades props = Propriedades.getInstancia();
		
		BaseRequisicao base = new BaseRequisicao();
		base.setAmbiente(props.getAmbiente());
		base.setLogin(props.getUsuario());//("87283164001");
		base.setSenha(props.getSenha());//("B@QyQ*AcI2*s");
		base.setTipoRetorno("JSON");
		
		PreSM preSM = new PreSM();
		Engate engate = new Engate();
		
		preSM.setEngate(engate);
		
		Detalhamento detalhamento = new Detalhamento();
		List<ColetaEntrega> coletasEntregas = new ArrayList<ColetaEntrega>();
		ColetaEntrega coletaEntrega = new ColetaEntrega();
		coletaEntrega.setTipo("COLETA");
		coletaEntrega.setCodIBGECidade(0L);
		Cliente cliente = new Cliente();
		
		coletaEntrega.setCliente(cliente);
		coletaEntrega.setDataHoraChegada("");
		coletaEntrega.setDataHoraSaida("");
		coletaEntrega.setObservacao("teste obs col 1");
		List<Produto> produtos = new ArrayList<Produto>();
		Produto produto = new Produto();
		produto.setCodProduto(0L);
		produto.setValor(0d);
		List<Documento> documentos = new ArrayList<Documento>();
		Documento documento = new Documento();
		
		documentos.add(documento);
		produto.setDocumentos(documentos);
		
		produtos.add(produto);
		coletaEntrega.setProdutos(produtos);
		coletasEntregas.add(coletaEntrega);
		
		detalhamento.setColetasEntregas(coletasEntregas);
		preSM.setDetalhamento(detalhamento);
		
		Rota rota = new Rota();
		
		preSM.setRota(rota);
		
		List<LocalizadorAvulso> localizadorAvulso = new ArrayList<LocalizadorAvulso>();
		
		preSM.setLocalizadorAvulso(localizadorAvulso);
		
		LiberacaoEngate liberacaoEngate = new LiberacaoEngate();
		
		preSM.setLiberacaoEngate(liberacaoEngate);
		
		EscoltaArmada escoltaArmada = new EscoltaArmada();
		
		preSM.setEscoltaArmada(escoltaArmada);
		
		EscoltaVelada escoltaVelada = new EscoltaVelada();
		
		preSM.setEscoltaVelada(escoltaVelada);
		
		base.setPreSM(preSM);
		
		return base;
		
	}
	
	public String getJson() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
        
        String json = new String();
		try {
			mapper.setPropertyNamingStrategy(new MyPascalCaseStrategy());
			json = mapper.writer().withDefaultPrettyPrinter().writeValueAsString(montaDados());
//			json = mapper.writeValueAsString(base);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return json;
	}
	

}
