package com.nuovonet.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Detalhamento {

	private List<ColetaEntrega> coletasEntregas;

	public List<ColetaEntrega> getColetasEntregas() {
		return coletasEntregas;
	}

	public void setColetasEntregas(List<ColetaEntrega> coletasEntregas) {
		this.coletasEntregas = coletasEntregas;
	}
}
