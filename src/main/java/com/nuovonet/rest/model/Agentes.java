package com.nuovonet.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Agentes {

	private String[] agentes;

	public String[] getAgentes() {
		return agentes;
	}

	public void setAgentes(String[] agentes) {
		this.agentes = agentes;
	}
}
