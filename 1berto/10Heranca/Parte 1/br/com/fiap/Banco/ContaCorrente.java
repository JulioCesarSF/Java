package br.com.fiap.Banco;

public class ContaCorrente extends ContaBancaria{
	
	private double limiteCredito;
	
	public ContaCorrente(){
		super();
		limiteCredito = 0.0;
	}

	public ContaCorrente(double saldo, Titular titular, int agencia, String numeroConta, double limiteCredito) {
		super(saldo, titular, agencia, numeroConta);
		this.limiteCredito = limiteCredito;
	}
	
	public ContaCorrente(double saldo, String nomeTitular, String cpfTitular, int agencia, String numeroConta, double limiteCredito){
		super(saldo, nomeTitular, cpfTitular, agencia, numeroConta);
		this.limiteCredito = limiteCredito;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}	

}
