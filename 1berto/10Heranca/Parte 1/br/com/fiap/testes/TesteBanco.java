package br.com.fiap.testes;

import br.com.fiap.Banco.ContaCorrente;
import br.com.fiap.Banco.ContaPoupanca;

public class TesteBanco {

	public static void main(String[] args) {
		/* TESTE CONTA CORRENTE */
		ContaCorrente cc = new ContaCorrente(1001.01, "Julio", "123.456.789-00", 101, "12345-0", 5000.01);
		System.out.println("Conta Corrente " + cc);
		System.out.println("Titular:\t" + cc.getTitular().getNome() + "\tCPF:\t" + cc.getTitular().getCpf());
		System.out.println("->Conta Corrente:\n"
				+ "Ag�ncia:\t" + cc.getAgencia() + "\tConta:\t" + cc.getNumeroConta()
				+ "\nSaldo:\t" + cc.getSaldo());
		
		System.out.println("\nOpera��es de saque e dep�sito ContaCorrente");
		double valorSaque = 1000.01, valorDeposito = 5001.01;
		
		System.out.println("Sacando R$ " + valorSaque);
		cc.sacarContaCorrente(valorSaque, cc.getLimiteCredito());		
		System.out.println("Saldo ap�s saque R$ " + cc.getSaldo() );
		
		System.out.println("Depositando R$ " + valorDeposito);
		cc.depositar(valorDeposito);
		System.out.println("Saldo ap�s dep�sito R$ " + cc.getSaldo() );
		System.out.println("Sacando R$ " + valorSaque);
		cc.sacarContaCorrente(valorSaque, cc.getLimiteCredito());
		System.out.println("Saldo ap�s saque R$ " + cc.getSaldo());
		
		
		System.out.println("");
		
		/* TESTE CONTA POUPAN�A */
		ContaPoupanca cp = new ContaPoupanca(1001.01, "Teste", "987.654.321-00", 102, "54321-0", 5000.01);
		System.out.println("Conta Poupan�a " + cp);
		System.out.println("Titular:\t" + cp.getTitular().getNome() + "\tCPF:\t" + cp.getTitular().getCpf());
		System.out.println("->Conta Poupan�a:\n"
				+ "Ag�ncia:\t" + cp.getAgencia() + "\tConta:\t" + cp.getNumeroConta()
				+ "\nSaldo:\t" + cp.getSaldo());
		
		System.out.println("\nOpera��es de saque e dep�sito ContaPoupanca");
		
		System.out.println("Sacando R$ " + valorSaque);
		cp.sacar(valorSaque);		
		System.out.println("Saldo ap�s saque R$ " + cp.getSaldo() );
		
		System.out.println("Depositando R$ " + valorDeposito);
		cp.depositar(valorDeposito);
		System.out.println("Saldo ap�s dep�sito R$ " + cp.getSaldo() );
		System.out.println("Sacando R$ " + valorSaque);
		cp.sacar(valorSaque);
		System.out.println("Saldo ap�s saque R$ " + cp.getSaldo());

	}

}
