package com.nuovonet.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ColetaEntrega {

	private String tipo; //COLETA ou ENTREGA
	private Long codIBGECidade;
	private String dataHoraChegada;
	private String dataHoraSaida;
	private String observacao;
	private Cliente cliente;
	private List<Produto> produtos;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Long getCodIBGECidade() {
		return codIBGECidade;
	}
	public void setCodIBGECidade(Long codIBGECidade) {
		this.codIBGECidade = codIBGECidade;
	}
	public String getDataHoraChegada() {
		return dataHoraChegada;
	}
	public void setDataHoraChegada(String dataHoraChegada) {
		this.dataHoraChegada = dataHoraChegada;
	}
	public String getDataHoraSaida() {
		return dataHoraSaida;
	}
	public void setDataHoraSaida(String dataHoraSaida) {
		this.dataHoraSaida = dataHoraSaida;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
}
