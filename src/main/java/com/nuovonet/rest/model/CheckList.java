package com.nuovonet.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CheckList {

	private String solicitarCheckList; //NAO, NORMAL, EXPRESSA
	private String tipoEquipamento; //SATHIB ou GPRS
	private String dataAgendamento;
	private String nomeContato;
	private String foneContato;
	private String emailContato;
	private String foneMotorista;
	
	public String getSolicitarCheckList() {
		return solicitarCheckList;
	}
	public void setSolicitarCheckList(String solicitarCheckList) {
		this.solicitarCheckList = solicitarCheckList;
	}
	public String getTipoEquipamento() {
		return tipoEquipamento;
	}
	public void setTipoEquipamento(String tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}
	public String getDataAgendamento() {
		return dataAgendamento;
	}
	public void setDataAgendamento(String dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	public String getNomeContato() {
		return nomeContato;
	}
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	public String getFoneContato() {
		return foneContato;
	}
	public void setFoneContato(String foneContato) {
		this.foneContato = foneContato;
	}
	public String getEmailContato() {
		return emailContato;
	}
	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}
	public String getFoneMotorista() {
		return foneMotorista;
	}
	public void setFoneMotorista(String foneMotorista) {
		this.foneMotorista = foneMotorista;
	}
}
