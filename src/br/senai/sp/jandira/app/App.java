package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// Cria��o da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.titular = "Maria Antonieta";		
		contaMaria.numeroAgencia = "4214-9";
		contaMaria.depositar(500); 
		contaMaria.tipo = "Corrente";
		
		// Cria��o da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.titular = "Pedro Cabral";
		contaPedro.depositar(500);
		contaPedro.tipo = "Poupan�a";
		contaPedro.numeroAgencia = "4214-9";
		
		// Cria��o da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.titular = "Ana Gomes";
		contaAna.depositar(500);
		contaAna.tipo = "Corrente";
		contaAna.numeroAgencia = "4214-9";
		
		
		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		System.out.println("===========================================================");
		System.out.println("===========================================================");
		System.out.println("===========================================================");
		
		 //depositar 100 reais na conta da maria
		contaMaria.depositar(700);
		contaMaria.exibirDetalhes();
		
		System.out.println("===========================================================");
		System.out.println("===========================================================");
		System.out.println("===========================================================");
		
		 //depositar 100 reais na conta da maria
		contaMaria.sacar(1500);
		contaMaria.exibirDetalhes();
		System.out.println("===========================================================");
		System.out.println("===========================================================");
		System.out.println("===========================================================");
		
		contaMaria.transferir(contaPedro, 4000);
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
	}

}
