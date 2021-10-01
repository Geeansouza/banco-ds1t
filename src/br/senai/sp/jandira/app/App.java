package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.titular = "Maria Antonieta";
		contaMaria.setnumeroAgencia("2414-9");
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		System.out.println(contaMaria.getTipo());
		System.out.println(contaMaria.getnumeroAgencia());

		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.titular = "Pedro Cabral";
		contaPedro.depositar(500);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.setnumeroAgencia("6547-6");
		System.out.println(contaPedro.getTipo());
		System.out.println(contaPedro.getnumeroAgencia());

		// Criação da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.titular = "Ana Gomes";
		contaAna.depositar(500);
		System.out.println();
		contaAna.setnumeroAgencia("23145-9");
		contaAna.setTipo(TipoConta.SALARIO);
		System.out.println(contaAna.getTipo());
		System.out.println(contaAna.getnumeroAgencia());

		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();

		System.out.println("===========================================================");
		System.out.println("===========================================================");
		System.out.println("===========================================================");

		// depositar 100 reais na conta da maria
		contaMaria.depositar(700);
		contaMaria.exibirDetalhes();

		System.out.println("===========================================================");
		System.out.println("===========================================================");
		System.out.println("===========================================================");

		// depositar 100 reais na conta da maria
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
