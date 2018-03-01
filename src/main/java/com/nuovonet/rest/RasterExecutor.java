package com.nuovonet.rest;

import com.nuovonet.rest.model.BaseRequisicao;
import com.nuovonet.rest.model.BaseRetorno;
import com.nuovonet.rest.model.TabelaRetorno;

public interface RasterExecutor {

	public BaseRetorno setPreSM(BaseRequisicao dados);
	public BaseRetorno getPreSM(String codigo);
	public String setCancelaPreSM(String codigo);
	public TabelaRetorno getTabela(String nomeTabela);
	public BaseRetorno getPosicoes(String tipoConsulta, String codUltimaPosicao);
	public BaseRetorno getMensagens(String tipoConsulta, String codUltimaMensagem);
}
