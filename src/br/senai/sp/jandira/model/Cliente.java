package br.senai.sp.jandira.model;

public class Cliente {

	private String nome;
	private String email;
	private double salario;
	
	public void setNome (String nome) {
		this.nome = nome;
	}public String getnome(){
		return nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}public String getEmail() {
		return  email;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario;
	}
		
	
}
