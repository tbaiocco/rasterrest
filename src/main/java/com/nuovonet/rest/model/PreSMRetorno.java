package com.nuovonet.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PreSMRetorno {

private String Codigo;
	
	private Engate engate;
	private Detalhamento detalhamento;
	private Rota rota;
	private CheckList checkList;
	private LiberacaoEngate liberacaoEngate;
	private List<LocalizadorAvulso> localizadorAvulso;
	private EscoltaArmada escoltaArmada;
	private EscoltaVelada escoltaVelada;
	private Status status;
	private List<Inconsistencia> inconsistencias;

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public Engate getEngate() {
		return engate;
	}

	public void setEngate(Engate engate) {
		this.engate = engate;
	}

	public Detalhamento getDetalhamento() {
		return detalhamento;
	}

	public void setDetalhamento(Detalhamento detalhamento) {
		this.detalhamento = detalhamento;
	}

	public Rota getRota() {
		return rota;
	}

	public void setRota(Rota rota) {
		this.rota = rota;
	}

	public CheckList getCheckList() {
		return checkList;
	}

	public void setCheckList(CheckList checkList) {
		this.checkList = checkList;
	}

	public LiberacaoEngate getLiberacaoEngate() {
		return liberacaoEngate;
	}

	public void setLiberacaoEngate(LiberacaoEngate liberacaoEngate) {
		this.liberacaoEngate = liberacaoEngate;
	}

	public List<LocalizadorAvulso> getLocalizadorAvulso() {
		return localizadorAvulso;
	}

	public void setLocalizadorAvulso(List<LocalizadorAvulso> localizadorAvulso) {
		this.localizadorAvulso = localizadorAvulso;
	}

	public EscoltaArmada getEscoltaArmada() {
		return escoltaArmada;
	}

	public void setEscoltaArmada(EscoltaArmada escoltaArmada) {
		this.escoltaArmada = escoltaArmada;
	}

	public EscoltaVelada getEscoltaVelada() {
		return escoltaVelada;
	}

	public void setEscoltaVelada(EscoltaVelada escoltaVelada) {
		this.escoltaVelada = escoltaVelada;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Inconsistencia> getInconsistencias() {
		return inconsistencias;
	}

	public void setInconsistencias(List<Inconsistencia> inconsistencias) {
		this.inconsistencias = inconsistencias;
	}
}
