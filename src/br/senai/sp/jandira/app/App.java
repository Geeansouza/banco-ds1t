package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		//agencia
		Agencia agenciaMaria = new Agencia();
		agenciaMaria.setNumeroAgencia("4214-9");
		agenciaMaria.setNomeGerente("Astolfo Dias");
		agenciaMaria.setCidadeAgencia("Jandira");
		agenciaMaria.setTelefoneGerente("5345-453");
		//cliente
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria Antonieta");
		clienteMaria.setEmail("maria@gmail.com");
		clienteMaria.setSalario(5000.00);

		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.setCliente(clienteMaria);
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		System.out.println(contaMaria.getTipo());
		System.out.println(contaMaria.getAgencia().getNumeroAgencia());
		//agencia pedro
		Agencia agenciaPedro = new Agencia();
		agenciaPedro.setNumeroAgencia("4214-9");
		agenciaPedro.setNomeGerente("Astolfo Dias");
		agenciaPedro.setCidadeAgencia("Jandira");
		agenciaPedro.setTelefoneGerente("5345-453");
		
		//cliente pedro
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Cabral");
		clientePedro.setEmail("pedro@gmail.com");
		clientePedro.setSalario(5000.00);

		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.setCliente(clientePedro);
		contaPedro.depositar(500);
		contaPedro.setTipo(TipoConta.POUPANCA);
		System.out.println(contaPedro.getTipo());
		System.out.println(contaPedro.getAgencia().getNumeroAgencia());
		
		//agencia ana
		Agencia agenciaAna = new Agencia();
		agenciaAna.setNumeroAgencia("4214-9");
		agenciaAna.setNomeGerente("Astolfo Dias");
		agenciaAna.setCidadeAgencia("Jandira");
		agenciaAna.setTelefoneGerente("5345-453");
		
		
		//cliente ana
		Cliente clienteAna = new Cliente();
		clienteAna.setNome("Ana Gomes");
		clienteAna.setEmail("Ana@gmail.com");
		clienteAna.setSalario(5000.00);

		// Criação da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.setCliente(clienteAna);
		contaAna.depositar(500);
		contaAna.setTipo(TipoConta.SALARIO);
		System.out.println(contaAna.getTipo());
		System.out.println(contaAna.getAgencia().getNumeroAgencia());

		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();

		/*System.out.println("===========================================================");
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
		contaPedro.exibirDetalhes();*/
	}

}
