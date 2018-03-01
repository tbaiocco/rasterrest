package com.nuovonet.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Veiculos {

	private String[] veiculos;

	public String[] getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(String[] veiculos) {
		this.veiculos = veiculos;
	}
}
