package com.nuovonet.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Engate {

	private Integer codFilial;
	private String placaVeiculo;
	private String vincVeiculo; //A=agregado, F=frota, T=terceiro
	private Integer codPerfilSeguranca;
	
	private String CPFMotorista1;
	private String vincMotorista1;
	
	private String cPFMotorista2;
	private String vincMotorista2;
	
	private String CPFAjudante;
	private String vincAjudante;
	
	private String placaCarreta1;
	private String vincCarreta1;
	private String placaCarreta2;
	private String vincCarreta2;
	private String placaCarreta3;
	private String vincCarreta3;
	
	private Integer codFaixaTemperatura;

	public Integer getCodFilial() {
		return codFilial;
	}

	public void setCodFilial(Integer codFilial) {
		this.codFilial = codFilial;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public String getVincVeiculo() {
		return vincVeiculo;
	}

	public void setVincVeiculo(String vincVeiculo) {
		this.vincVeiculo = vincVeiculo;
	}

	public Integer getCodPerfilSeguranca() {
		return codPerfilSeguranca;
	}

	public void setCodPerfilSeguranca(Integer codPerfilSeguranca) {
		this.codPerfilSeguranca = codPerfilSeguranca;
	}
	@JsonProperty("CPFMotorista1")
	public String getCPFMotorista1() {
		return CPFMotorista1;
	}

	public void setCPFMotorista1(String cPFMotorista1) {
		CPFMotorista1 = cPFMotorista1;
	}

	public String getVincMotorista1() {
		return vincMotorista1;
	}

	public void setVincMotorista1(String vincMotorista1) {
		this.vincMotorista1 = vincMotorista1;
	}
	@JsonProperty("CPFMotorista2")
	public String getCPFMotorista2() {
		return cPFMotorista2;
	}

	public void setCPFMotorista2(String cPFMotorista2) {
		this.cPFMotorista2 = cPFMotorista2;
	}

	public String getVincMotorista2() {
		return vincMotorista2;
	}

	public void setVincMotorista2(String vincMotorista2) {
		this.vincMotorista2 = vincMotorista2;
	}
	@JsonProperty("CPFAjudante")
	public String getCPFAjudante() {
		return CPFAjudante;
	}

	public void setCPFAjudante(String cPFAjudante) {
		CPFAjudante = cPFAjudante;
	}

	public String getVincAjudante() {
		return vincAjudante;
	}

	public void setVincAjudante(String vincAjudante) {
		this.vincAjudante = vincAjudante;
	}

	public String getPlacaCarreta1() {
		return placaCarreta1;
	}

	public void setPlacaCarreta1(String placaCarreta1) {
		this.placaCarreta1 = placaCarreta1;
	}

	public String getVincCarreta1() {
		return vincCarreta1;
	}

	public void setVincCarreta1(String vincCarreta1) {
		this.vincCarreta1 = vincCarreta1;
	}

	public String getPlacaCarreta2() {
		return placaCarreta2;
	}

	public void setPlacaCarreta2(String placaCarreta2) {
		this.placaCarreta2 = placaCarreta2;
	}

	public String getVincCarreta2() {
		return vincCarreta2;
	}

	public void setVincCarreta2(String vincCarreta2) {
		this.vincCarreta2 = vincCarreta2;
	}

	public String getPlacaCarreta3() {
		return placaCarreta3;
	}

	public void setPlacaCarreta3(String placaCarreta3) {
		this.placaCarreta3 = placaCarreta3;
	}

	public String getVincCarreta3() {
		return vincCarreta3;
	}

	public void setVincCarreta3(String vincCarreta3) {
		this.vincCarreta3 = vincCarreta3;
	}

	public Integer getCodFaixaTemperatura() {
		return codFaixaTemperatura;
	}

	public void setCodFaixaTemperatura(Integer codFaixaTemperatura) {
		this.codFaixaTemperatura = codFaixaTemperatura;
	}
	
}
