package com.nuovonet.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Documento {

	private String tipo; //BIP, CHASSI, LOAD NUMBER, CTE, CTRC, LACRE, MANIFESTO, MIC, NOTA FISCAL, PEDIDO
	private String numero;
	private Double valor;
	private Double peso;
	private Double pesoCubado;
	private Double volume;
	private Double cubagem;
	private String centroCusto;
	private String dataEmissao;
	private String dataAgendamento;
	private String valorServico;
	private String observacao1;
	private String observacao2;
	private String observacao3;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getPesoCubado() {
		return pesoCubado;
	}
	public void setPesoCubado(Double pesoCubado) {
		this.pesoCubado = pesoCubado;
	}
	public Double getVolume() {
		return volume;
	}
	public void setVolume(Double volume) {
		this.volume = volume;
	}
	public Double getCubagem() {
		return cubagem;
	}
	public void setCubagem(Double cubagem) {
		this.cubagem = cubagem;
	}
	public String getCentroCusto() {
		return centroCusto;
	}
	public void setCentroCusto(String centroCusto) {
		this.centroCusto = centroCusto;
	}
	public String getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getDataAgendamento() {
		return dataAgendamento;
	}
	public void setDataAgendamento(String dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	public String getValorServico() {
		return valorServico;
	}
	public void setValorServico(String valorServico) {
		this.valorServico = valorServico;
	}
	public String getObservacao1() {
		return observacao1;
	}
	public void setObservacao1(String observacao1) {
		this.observacao1 = observacao1;
	}
	public String getObservacao2() {
		return observacao2;
	}
	public void setObservacao2(String observacao2) {
		this.observacao2 = observacao2;
	}
	public String getObservacao3() {
		return observacao3;
	}
	public void setObservacao3(String observacao3) {
		this.observacao3 = observacao3;
	}
	
}
