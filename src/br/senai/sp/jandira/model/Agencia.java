package br.senai.sp.jandira.model;

public class Agencia {
	
	private String numeroAgencia;
	private String nomeGerente;
	private String telefoneGerente;
	private String cidadeAgencia;
	
	public void setNumeroAgencia (String numeroAgencia){
		this.numeroAgencia = numeroAgencia;
	}public String getNumeroAgencia(){
		return this.cidadeAgencia;
	}
	public void setNomeGerente(String nomeGerente){
		this.nomeGerente = nomeGerente;
	}public String getNomeGerente(String nomeGerente){
		return this.nomeGerente;
	}
	public void setTelefoneGerente(String telefoneGerente){
		this.telefoneGerente = telefoneGerente;
	}public String getTelefoneGerente(String telefoneGerente){
		return this.telefoneGerente;
	}
	public void setCidadeAgencia(String cidadeAgencia){
		this.cidadeAgencia = cidadeAgencia;
	}
}

