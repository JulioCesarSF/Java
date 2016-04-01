package descanso7.Mod;

public class ContaCorrente {
	
	private String titular, numeroContaCorrente;
	private int agenciaContaCorrente;
	private double saldo;	
	
	public ContaCorrente() {}

	public ContaCorrente(String titular, String numeroContaCorrente, int agenciaContaCorrente, double saldo) {
		this.titular = titular;
		this.numeroContaCorrente = numeroContaCorrente;
		this.agenciaContaCorrente = agenciaContaCorrente;
		this.saldo = saldo;
	}

	public double deposito(double valor){
		this.saldo += valor;
		return this.saldo;
	}
	
	public double saque(double valor){
		if(this.saldo == 0)
			System.out.println("Você não possui fundos suficientes!");		
		else{
			if( (this.saldo - valor) < 0 ){
				System.out.println("Você não possui saldo suficientes para este saque.\n Saque não realizado!");				
			}
			else{
				this.saldo -= valor;
				System.out.println("Saque realizado!");
			}
		}		
		return this.saldo;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void exibirSaldo(){
		System.out.println("Olá " + this.titular + ", seu saldo é: R$ " + String.format("%.2f", this.saldo));
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}
	public int getAgenciaContaCorrente() {
		return agenciaContaCorrente;
	}
	public void setAgenciaContaCorrente(int agenciaContaCorrente) {
		this.agenciaContaCorrente = agenciaContaCorrente;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
