package application;

import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		Cliente venilton = new Cliente();
		venilton.setNome("Cliente01");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
