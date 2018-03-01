package com.nuovonet.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EscoltaVelada {

	private String[] veiculos;
	private String[] agentes;
	
	public String[] getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(String[] veiculos) {
		this.veiculos = veiculos;
	}
	public String[] getAgentes() {
		return agentes;
	}
	public void setAgentes(String[] agentes) {
		this.agentes = agentes;
	}
	
//	private Veiculos veiculos;
//	private Agentes agentes;
//	
//	public Veiculos getVeiculos() {
//		return veiculos;
//	}
//	public void setVeiculos(Veiculos veiculos) {
//		this.veiculos = veiculos;
//	}
//	public Agentes getAgentes() {
//		return agentes;
//	}
//	public void setAgentes(Agentes agentes) {
//		this.agentes = agentes;
//	}
}
