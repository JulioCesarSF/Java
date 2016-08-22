package br.com.fiap.beans;

public class ContaPoupanca extends ContaBancaria {
	
	private double taxaJuros;
	
	public ContaPoupanca(){super(); taxaJuros = 0;}

	public ContaPoupanca(double saldo, Titular titular, int agencia, String numeroConta) {
		super(saldo, titular, agencia, numeroConta);
		taxaJuros = 0;
	}
	
	public ContaPoupanca(double saldo, Titular titular, int agencia, String numeroConta, int taxaJuros) {
		super(saldo, titular, agencia, numeroConta);
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizarSaldo(){
		super.setSaldo(super.getSaldo() + (super.getSaldo()*(taxaJuros/100)));
	}
	
	public String getAll(){
		return super.getTudo() + "\nTaxa Juros:\t" + taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}	

}
