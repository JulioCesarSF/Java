package br.com.fiap.beans;

public class Telefone {

	private short ddd;
	private int numero;

	public Telefone() {
	}

	public Telefone(short ddd, int numero) {
		this.ddd = ddd;
		this.numero = numero;
	}
	
	public String getTelefone(){
		return "(" + ddd + ")" + numero;
	}

	public short getDdd() {
		return ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setDdd(short ddd) {
		this.ddd = ddd;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
