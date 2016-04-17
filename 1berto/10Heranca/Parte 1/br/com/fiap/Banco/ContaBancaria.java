package br.com.fiap.Banco;

public class ContaBancaria {
	
	private double saldo;
	private Titular titular;
	private int agencia;
	private String numeroConta;

	public ContaBancaria() {
		saldo = 0.0;
		titular = new Titular();
		agencia = 0;
		numeroConta = new String();
	}
	
	public ContaBancaria(double saldo, Titular titular, int agencia, String numeroConta){
		this.saldo = saldo;
		this.titular = titular; //objeto j� instanciado
		this.agencia = agencia;
		this.numeroConta = new String(numeroConta);
	}
	public ContaBancaria(double saldo, String nomeTitular, String cpfTitular, int agencia, String numeroConta){
		this.saldo = saldo;
		titular = new Titular(nomeTitular, cpfTitular);
		this.agencia = agencia;
		this.numeroConta = new String(numeroConta);
	}
	
	public void sacar(double valor){ //n�o leva em conta o limite de cr�dito na conta corrente
		if(valor > 0.0){
			double novoSaldo = saldo - valor;
			if(novoSaldo >= 0.0)
				saldo-=valor;			
			else
				System.out.println("Saldo n�o � suficiente para realizar este saque!");
		}			
	}
	
	/**
	 * 
	 * Calcular saque com limite de cr�dito
	 * 
	 * @param valor
	 * @param limiteCredito
	 * @return limite de cr�dito
	 */
	public double sacarContaCorrente(double valor, double limiteCredito){
		double novoSaldo = (saldo - valor) + limiteCredito; //saldo - valorSque + credito se ficar negativo
		if(novoSaldo > 0.0){ //� poss�vel sacar			
			if((saldo - valor) < 0.0){ //se sacou, usou o limite de credito?
				double novoLimite = limiteCredito + (saldo - valor);
				saldo-=valor; //conta ficou negativa mas tem limite de cr�dito
				return novoLimite;
			}else if((saldo - valor) > 0.0){ //n�o usou o limite de cr�dito
				saldo-=valor;
				return limiteCredito;
			}
		}		
		else if( novoSaldo < 0.0 ){//n�o � poss�vel sacar mesmo como o limite de cr�dito
			System.out.println("Saldo com limite de cr�dito n�o � suficiente!");
			return limiteCredito;
		}
		//sacou e ficou sem limite e com a conta no 0
		saldo = 0.0;
		return 0.0;		
	}
	
	public void depositar(double valor){
		saldo+=valor;
	}
	
	/* gerados pelo eclipse */

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}	

}
