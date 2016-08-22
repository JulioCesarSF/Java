package br.com.fiap.beans;

import br.com.fiap.excecoes.Excecoes;

public class ContaBancaria {
	
	private double saldo;
	private Titular titular;
	private int agencia;
	private String numeroConta;
	
	public ContaBancaria(){
		saldo = 0;
		titular = null;
		agencia = 0;
		numeroConta = null;
	}

	public ContaBancaria(double saldo, Titular titular, int agencia, String numeroConta) {
		this.saldo = saldo;
		this.titular = titular;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}
	
	public void sacar(double valor) throws Excecoes{		
		if(valor < 0d)
			throw new Excecoes("Valor negativo! (sacar) ", true);				
	}
	
	public void depositar(double valor) throws Excecoes{
		if(valor < 0d)
			throw new Excecoes("Valor negativo! (depositar) ", true);
		else
			saldo+=valor;
	}
	
	public String getTudo(){
		String tipo = new String( (this instanceof ContaCorrente) ? "Conta Corrente" : "Conta Poupança");	
		return tipo + "\n" + titular.getTudo() + "\nAgência:\t" + agencia + "\nNumero Conta:\t" + numeroConta + "\nSaldo:\t" + saldo;
	}
	
	public String exibirSaldo(){
		String tipo = new String();
		if(this instanceof ContaCorrente)
			tipo = "Conta Corrente";
		else
			tipo = "Conta Poupança";
		return tipo + "\n" + saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public Titular getTitular() {
		return titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}	

}
