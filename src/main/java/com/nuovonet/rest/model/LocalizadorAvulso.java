package com.nuovonet.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalizadorAvulso {
	
	private String terminalTecnologia;
	private String codTecnologia;
	private String codModelo;
	
	public String getTerminalTecnologia() {
		return terminalTecnologia;
	}
	public void setTerminalTecnologia(String terminalTecnologia) {
		this.terminalTecnologia = terminalTecnologia;
	}
	public String getCodTecnologia() {
		return codTecnologia;
	}
	public void setCodTecnologia(String codTecnologia) {
		this.codTecnologia = codTecnologia;
	}
	public String getCodModelo() {
		return codModelo;
	}
	public void setCodModelo(String codModelo) {
		this.codModelo = codModelo;
	}

}
