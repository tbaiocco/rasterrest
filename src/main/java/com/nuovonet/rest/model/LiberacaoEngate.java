package com.nuovonet.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LiberacaoEngate {

	private String solicitarPesquisa = "NAO"; //NAO, NORMAL, EXPRESSA
	private String dadosPesqVeiculo;
	private String dadosPesqMotorista1;
	private String dadosPesqMotorista2;
	private String dadosPesqAjudante;
	private String dadosPesqCarreta1;
	private String dadosPesqCarreta2;
	private String dadosPesqCarreta3;
	
	public String getSolicitarPesquisa() {
		return solicitarPesquisa;
	}

	public void setSolicitarPesquisa(String solicitarPesquisa) {
		this.solicitarPesquisa = solicitarPesquisa;
	}

	public String getDadosPesqVeiculo() {
		return dadosPesqVeiculo;
	}

	public void setDadosPesqVeiculo(String dadosPesqVeiculo) {
		this.dadosPesqVeiculo = dadosPesqVeiculo;
	}

	public String getDadosPesqMotorista1() {
		return dadosPesqMotorista1;
	}

	public void setDadosPesqMotorista1(String dadosPesqMotorista1) {
		this.dadosPesqMotorista1 = dadosPesqMotorista1;
	}

	public String getDadosPesqMotorista2() {
		return dadosPesqMotorista2;
	}

	public void setDadosPesqMotorista2(String dadosPesqMotorista2) {
		this.dadosPesqMotorista2 = dadosPesqMotorista2;
	}

	public String getDadosPesqAjudante() {
		return dadosPesqAjudante;
	}

	public void setDadosPesqAjudante(String dadosPesqAjudante) {
		this.dadosPesqAjudante = dadosPesqAjudante;
	}

	public String getDadosPesqCarreta1() {
		return dadosPesqCarreta1;
	}

	public void setDadosPesqCarreta1(String dadosPesqCarreta1) {
		this.dadosPesqCarreta1 = dadosPesqCarreta1;
	}

	public String getDadosPesqCarreta2() {
		return dadosPesqCarreta2;
	}

	public void setDadosPesqCarreta2(String dadosPesqCarreta2) {
		this.dadosPesqCarreta2 = dadosPesqCarreta2;
	}

	public String getDadosPesqCarreta3() {
		return dadosPesqCarreta3;
	}

	public void setDadosPesqCarreta3(String dadosPesqCarreta3) {
		this.dadosPesqCarreta3 = dadosPesqCarreta3;
	}
}
