package br.com.fiap.beans;

public class Pedido {

	private int numero;
	private double total;
	private String dtPedido;
	
	
	public Pedido() {
		super();
	}

	public Pedido(int numero, double total, String dtPedido) {
		super();
		this.numero = numero;
		this.total = total;
		this.dtPedido = dtPedido;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getDtPedido() {
		return dtPedido;
	}

	public void setDtPedido(String dtPedido) {
		this.dtPedido = dtPedido;
	}
	
	public String getTudo(){
		return numero + "\n" + total + "\n" + dtPedido;
	}
	
	
	
	
}
