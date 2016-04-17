package br.com.fiap.Banco;

public class ContaPoupanca extends ContaBancaria {
	
	private double taxaJuros;
	
	public ContaPoupanca(){
		super();
		taxaJuros = 0.0;
	}

	public ContaPoupanca(double saldo, Titular titular, int agencia, String numeroConta, double taxaJuros) {
		super(saldo, titular, agencia, numeroConta);
		this.taxaJuros = taxaJuros;
	}
	
	public ContaPoupanca(double saldo, String nomeTitular, String cpfTitular, int agencia, String numeroConta, double taxaJuros) {
		super(saldo, nomeTitular, cpfTitular, agencia, numeroConta);
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizarSaldo(){
		super.setSaldo( super.getSaldo() + (super.getSaldo() * (taxaJuros/100)) );
	}
	
	/* gerados pelo eclipse */
	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	

}
