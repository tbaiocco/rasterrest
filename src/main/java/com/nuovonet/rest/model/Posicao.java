package com.nuovonet.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Posicao {

	private Long codPosicao;
	private String placa;
	private String codTerminal;
	private String tipoRastreador;
	private String dataHoraPos;
	private Double distUltPosicao;
	private String ignicao;
	private Double latitude;
	private Double longitude;
	private String posReferencia;
	private Long velocidade;
	private Long veloMediaCalc;
	private String cidade;
	private String uF;
	private String pais;
	
	public Long getCodPosicao() {
		return codPosicao;
	}
	public void setCodPosicao(Long codPosicao) {
		this.codPosicao = codPosicao;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCodTerminal() {
		return codTerminal;
	}
	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}
	public String getTipoRastreador() {
		return tipoRastreador;
	}
	public void setTipoRastreador(String tipoRastreador) {
		this.tipoRastreador = tipoRastreador;
	}
	public String getDataHoraPos() {
		return dataHoraPos;
	}
	public void setDataHoraPos(String dataHoraPos) {
		this.dataHoraPos = dataHoraPos;
	}
	public Double getDistUltPosicao() {
		return distUltPosicao;
	}
	public void setDistUltPosicao(Double distUltPosicao) {
		this.distUltPosicao = distUltPosicao;
	}
	public String getIgnicao() {
		return ignicao;
	}
	public void setIgnicao(String ignicao) {
		this.ignicao = ignicao;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getPosReferencia() {
		return posReferencia;
	}
	public void setPosReferencia(String posReferencia) {
		this.posReferencia = posReferencia;
	}
	public Long getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(Long velocidade) {
		this.velocidade = velocidade;
	}
	public Long getVeloMediaCalc() {
		return veloMediaCalc;
	}
	public void setVeloMediaCalc(Long veloMediaCalc) {
		this.veloMediaCalc = veloMediaCalc;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getuF() {
		return uF;
	}
	public void setuF(String uF) {
		this.uF = uF;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
}
