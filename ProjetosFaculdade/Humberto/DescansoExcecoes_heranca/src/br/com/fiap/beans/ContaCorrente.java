package br.com.fiap.beans;

import br.com.fiap.excecoes.Excecoes;

public class ContaCorrente extends ContaBancaria {

	private double limiteCredito;

	public ContaCorrente() {
		super();
		limiteCredito = 0;
	}

	public ContaCorrente(double limiteCredito) {
		super();
		this.limiteCredito = limiteCredito;
	}

	public ContaCorrente(double saldo, Titular titular, int agencia, String numeroConta) {
		super(saldo, titular, agencia, numeroConta);
		limiteCredito = 0;
	}

	public ContaCorrente(double saldo, Titular titular, int agencia, String numeroConta, double limiteCredito) {
		super(saldo, titular, agencia, numeroConta);
		this.limiteCredito = limiteCredito;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) throws Excecoes {
		if (limiteCredito < 0d)
			throw new Excecoes("Valor Negativo (limiteCredito, ContaCorrente) ", false);
		else
			this.limiteCredito = limiteCredito;
	}

	@Override
	public void sacar(double valor) throws Excecoes {
		super.sacar(valor);
		if ((super.getSaldo() + this.limiteCredito - valor) < 0d) {
			throw new Excecoes("Saldo insuficiente! (sacar ContaCorrente)", true);
		} else {
			double old = super.getSaldo();			
			super.setSaldo((super.getSaldo() - valor) < 0d ? 0 : (super.getSaldo() - valor));			
			this.limiteCredito = (super.getSaldo() == 0 && (old - valor < 0d) ) ? this.limiteCredito - (old - valor)*-1 : this.limiteCredito;
		}
	}

	@Override
	public String getTudo() {
		return super.getTudo() + "\nLimite Crédito:\t" + limiteCredito;
	}

	@Override
	public String exibirSaldo() {
		return super.exibirSaldo() + " Limite de R$ " + limiteCredito + "\nTotal Disponível R$"
				+ (limiteCredito + super.getSaldo());
	}

}
