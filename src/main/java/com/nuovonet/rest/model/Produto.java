package com.nuovonet.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Produto {

	private Long codProduto;
	
	private String NCMProduto;
	private Double valor;
	private List<Documento> documentos;
	
	public Long getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(Long codProduto) {
		this.codProduto = codProduto;
	}
	@JsonProperty("NCMProduto")
	public String getNCMProduto() {
		return NCMProduto;
	}
	public void setNCMProduto(String nCMProduto) {
		NCMProduto = nCMProduto;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public List<Documento> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}
	
}
