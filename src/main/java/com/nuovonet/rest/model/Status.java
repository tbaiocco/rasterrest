package com.nuovonet.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Status {

	private String Engate = "S";
	private String Detalhamento ="N";
	private String Rota ="S";
	private String TesteRastreador="I";
	private String LiberacaoEngate="N";
	private String LocalizadorSecundario="I";
	private String LocalizadorAvulso="I";
	private String EscoltaVelada="I";
	private String EscoltaArmada="I";
	
	public String getEngate() {
		return Engate;
	}
	public void setEngate(String engate) {
		Engate = engate;
	}
	public String getDetalhamento() {
		return Detalhamento;
	}
	public void setDetalhamento(String detalhamento) {
		Detalhamento = detalhamento;
	}
	public String getRota() {
		return Rota;
	}
	public void setRota(String rota) {
		Rota = rota;
	}
	public String getTesteRastreador() {
		return TesteRastreador;
	}
	public void setTesteRastreador(String testeRastreador) {
		TesteRastreador = testeRastreador;
	}
	public String getLiberacaoEngate() {
		return LiberacaoEngate;
	}
	public void setLiberacaoEngate(String liberacaoEngate) {
		LiberacaoEngate = liberacaoEngate;
	}
	public String getLocalizadorSecundario() {
		return LocalizadorSecundario;
	}
	public void setLocalizadorSecundario(String localizadorSecundario) {
		LocalizadorSecundario = localizadorSecundario;
	}
	public String getLocalizadorAvulso() {
		return LocalizadorAvulso;
	}
	public void setLocalizadorAvulso(String localizadorAvulso) {
		LocalizadorAvulso = localizadorAvulso;
	}
	public String getEscoltaVelada() {
		return EscoltaVelada;
	}
	public void setEscoltaVelada(String escoltaVelada) {
		EscoltaVelada = escoltaVelada;
	}
	public String getEscoltaArmada() {
		return EscoltaArmada;
	}
	public void setEscoltaArmada(String escoltaArmada) {
		EscoltaArmada = escoltaArmada;
	} 
		
}
