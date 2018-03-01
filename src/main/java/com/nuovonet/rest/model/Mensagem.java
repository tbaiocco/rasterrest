package com.nuovonet.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Mensagem {

	private Long codMensagem;
	private String placa;
	private String codTecnologia;
	private String codTerminal;
	private String dataHoraMsg;
	private Double latitude;
	private Double longitude;
	private Long nrMacro;
	private String texto;
	
	public Long getCodMensagem() {
		return codMensagem;
	}
	public void setCodMensagem(Long codMensagem) {
		this.codMensagem = codMensagem;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCodTecnologia() {
		return codTecnologia;
	}
	public void setCodTecnologia(String codTecnologia) {
		this.codTecnologia = codTecnologia;
	}
	public String getCodTerminal() {
		return codTerminal;
	}
	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}
	public String getDataHoraMsg() {
		return dataHoraMsg;
	}
	public void setDataHoraMsg(String dataHoraMsg) {
		this.dataHoraMsg = dataHoraMsg;
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
	public Long getNrMacro() {
		return nrMacro;
	}
	public void setNrMacro(Long nrMacro) {
		this.nrMacro = nrMacro;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
