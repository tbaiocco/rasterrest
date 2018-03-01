package com.nuovonet.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TabelaRetorno {

	private String Ambiente;
	private String Metodo;
	private String Login;
	private String NomeTabela;
	private String CodErro;
	private String MsgErro;
	
	private List<Linha> linhas;

	public String getAmbiente() {
		return Ambiente;
	}

	public void setAmbiente(String ambiente) {
		Ambiente = ambiente;
	}

	public String getMetodo() {
		return Metodo;
	}

	public void setMetodo(String metodo) {
		Metodo = metodo;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getNomeTabela() {
		return NomeTabela;
	}

	public void setNomeTabela(String nomeTabela) {
		NomeTabela = nomeTabela;
	}

	public String getCodErro() {
		return CodErro;
	}

	public void setCodErro(String codErro) {
		CodErro = codErro;
	}

	public String getMsgErro() {
		return MsgErro;
	}

	public void setMsgErro(String msgErro) {
		MsgErro = msgErro;
	}

	public List<Linha> getLinhas() {
		return linhas;
	}

	public void setLinhas(List<Linha> linhas) {
		this.linhas = linhas;
	}
	
}
