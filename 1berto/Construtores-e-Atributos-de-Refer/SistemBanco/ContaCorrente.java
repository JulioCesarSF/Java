package br.com.fiap.tds.ltp.sistemabanco.entidades;

public class ContaCorrente {
	
	private double saldo;
	private Cliente titular;	
	
	public ContaCorrente() {}

	public ContaCorrente(double saldo, Cliente titular) {
		this.saldo = saldo;
		this.titular = titular;
	}

	public double retornaSaldo(){
		return this.saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public String representar(){
		if( (this.titular == null) || (this.titular.getEndereco() == null))
			return "Impossível mostrar dados.";
		
		return "Titular: \n"
				+ "\n Nome: " + titular.getNome()
				+ "\n CPF: " + titular.getCpf()
				+ "\n\nDados Pessoais:\n"
				+ "\n Rua: " + this.titular.getEndereco().getRua()
				+ " N: " + this.titular.getEndereco().getNumero()
				+ " Complemento: " + this.titular.getEndereco().getComplemento()
				+ "\n Bairro: " + this.titular.getEndereco().getBairro()
				+ " CEP: " + this.titular.getEndereco().getCep()
				+ "\n\nSALDO ATUAL: R$ " + this.saldo;
	}	

}
