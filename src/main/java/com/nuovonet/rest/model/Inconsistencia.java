package com.nuovonet.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Inconsistencia {

	private String Guia="";
	private String Tipo="";
	private String Identificacao="";
	private String Descricao;
	private String CodAlerta="";
	private String MsgAlerta="";
	
	public String getGuia() {
		return Guia;
	}
	public void setGuia(String guia) {
		Guia = guia;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getIdentificacao() {
		return Identificacao;
	}
	public void setIdentificacao(String identificacao) {
		Identificacao = identificacao;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public String getCodAlerta() {
		return CodAlerta;
	}
	public void setCodAlerta(String codAlerta) {
		CodAlerta = codAlerta;
	}
	public String getMsgAlerta() {
		return MsgAlerta;
	}
	public void setMsgAlerta(String msgAlerta) {
		MsgAlerta = msgAlerta;
	}

}
