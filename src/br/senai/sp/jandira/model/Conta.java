package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {
	
	private TipoConta tipo;
	private String numero;
	public String numeroAgencia;
	public Cliente titular;
	private double saldo;
	
	public Conta(String numeroConta) {
		this.numero = numeroConta;
	}
	public void setTipo(TipoConta tipo){
		this.tipo = tipo;
	}
	
	public TipoConta getTipo() {
		return tipo;
	}
	
	public void setnumeroAgencia (String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getnumeroAgencia() {
		return numeroAgencia;
	}
	
	
	public void depositar(double valorDeposito) {
	if (valorDeposito >= 0) {
		saldo += valorDeposito;
	}else {
		System.out.println("DEPOSITO INCORRETO");
	}
	}
	
	public boolean sacar(double valorSaque) {
	if(valorSaque >= 0 && valorSaque <= saldo) {
		saldo -= valorSaque;
		return true;
	}else if(valorSaque > saldo) {
		System.out.println("SALDO INSUFICIENTE");
		return false;
	}
	else {
		System.out.println("SAQUE INCORRETO");
		return false;
	}
	}
	
	public void transferir(Conta contaDestino, double valorTransferencia) {
		boolean resultado = sacar(valorTransferencia);
		contaDestino.depositar(valorTransferencia);
		if(resultado) {}
	}
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
}
   