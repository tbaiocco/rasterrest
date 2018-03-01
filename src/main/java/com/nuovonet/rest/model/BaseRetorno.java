package com.nuovonet.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseRetorno {

	private String Ambiente;
	private String Metodo;
	private String Login;
	private String Senha;
	private String TipoRetorno;
	
	private PreSMRetorno preSM;
	private List<Posicao> Posicoes;
	private List<Mensagem> Mensagens;
	
	private String CodErro;
	private String MsgErro;
	public String getAmbiente() {
		return Ambiente;
	}
	public void setAmbiente(String ambiente) {
		Ambiente = ambiente;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public String getTipoRetorno() {
		return TipoRetorno;
	}
	public void setTipoRetorno(String tipoRetorno) {
		TipoRetorno = tipoRetorno;
	}
	public PreSMRetorno getPreSM() {
		return preSM;
	}
	public void setPreSM(PreSMRetorno preSM) {
		this.preSM = preSM;
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
	public String getMetodo() {
		return Metodo;
	}
	public void setMetodo(String metodo) {
		Metodo = metodo;
	}
	public List<Posicao> getPosicoes() {
		return Posicoes;
	}
	public void setPosicoes(List<Posicao> posicoes) {
		Posicoes = posicoes;
	}
	public List<Mensagem> getMensagens() {
		return Mensagens;
	}
	public void setMensagens(List<Mensagem> mensagens) {
		Mensagens = mensagens;
	}
	
}
