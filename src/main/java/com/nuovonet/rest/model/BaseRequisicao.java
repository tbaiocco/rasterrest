package com.nuovonet.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class BaseRequisicao {
	
//	private String Ambiente = "Homologacao";
//	private String Login = "usuario";
//	private String Senha = "senha";
//	private String TipoRetorno = "JSON";
	
	private String Ambiente;
	private String Login;
	private String Senha;
	private String TipoRetorno;
	
	private PreSM preSM;
	
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
	public PreSM getPreSM() {
		return preSM;
	}
	public void setPreSM(PreSM preSM) {
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

}
