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
		this.titular = titular; //objeto já instanciado
		this.agencia = agencia;
		this.numeroConta = new String(numeroConta);
	}
	public ContaBancaria(double saldo, String nomeTitular, String cpfTitular, int agencia, String numeroConta){
		this.saldo = saldo;
		titular = new Titular(nomeTitular, cpfTitular);
		this.agencia = agencia;
		this.numeroConta = new String(numeroConta);
	}
	
	public void sacar(double valor){ //não leva em conta o limite de crédito na conta corrente
		if(valor > 0.0){
			double novoSaldo = saldo - valor;
			if(novoSaldo >= 0.0)
				saldo-=valor;			
			else
				System.out.println("Saldo não é suficiente para realizar este saque!");
		}			
	}
	
	/**
	 * 
	 * Calcular saque com limite de crédito
	 * 
	 * @param valor
	 * @param limiteCredito
	 * @return limite de crédito
	 */
	public double sacarContaCorrente(double valor, double limiteCredito){
		double novoSaldo = (saldo - valor) + limiteCredito; //saldo - valorSque + credito se ficar negativo
		if(novoSaldo > 0.0){ //é possível sacar			
			if((saldo - valor) < 0.0){ //se sacou, usou o limite de credito?
				double novoLimite = limiteCredito + (saldo - valor);
				saldo-=valor; //conta ficou negativa mas tem limite de crédito
				return novoLimite;
			}else if((saldo - valor) > 0.0){ //não usou o limite de crédito
				saldo-=valor;
				return limiteCredito;
			}
		}		
		else if( novoSaldo < 0.0 ){//não é possível sacar mesmo como o limite de crédito
			System.out.println("Saldo com limite de crédito não é suficiente!");
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
