package com.nuovonet.rest.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propriedades {
	private static Propriedades instancia;

	private static final String ARQUIVO_PROPRIEDADES = "/raster.properties";

	private String usuario = "";

	private String senha = "";

	private String ambiente = "";

	private String url = "";

	public static synchronized Propriedades getInstancia() {
		if (instancia == null) {
			instancia = new Propriedades();
			// Locale loc = new Locale("pt", "BR");
			// Locale.setDefault(loc);
		}
		return instancia;
	}

	public Propriedades() {
		doSetPadrao();
	}

	private void doSetPadrao() {
		Properties props = new Properties();
		try {
			File file = new File(System.getenv("DOC_E_HOME")+ARQUIVO_PROPRIEDADES);
			if(file.exists()) {
				System.out.println(file.getAbsolutePath());
				props.load(new FileInputStream(file));
			} else {
				props.load(getClass().getResourceAsStream(ARQUIVO_PROPRIEDADES));
			}

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		usuario = props.getProperty("usuario");
		senha = props.getProperty("senha");
		ambiente = props.getProperty("ambiente");
		url = props.getProperty("url");
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
