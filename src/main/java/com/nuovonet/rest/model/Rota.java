package com.nuovonet.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rota {

	private String codRota;
	
	private List<LocalParada> locaisParada;

	public String getCodRota() {
		return codRota;
	}

	public void setCodRota(String codRota) {
		this.codRota = codRota;
	}

	public List<LocalParada> getLocaisParada() {
		return locaisParada;
	}

	public void setLocaisParada(List<LocalParada> locaisParada) {
		this.locaisParada = locaisParada;
	}
}
