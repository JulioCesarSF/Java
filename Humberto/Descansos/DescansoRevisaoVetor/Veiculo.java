package br.com.fiap.Beans;

import java.text.NumberFormat;
import java.util.StringJoiner;

public class Veiculo {

	private String modelo, montadora;
	private int ano;
	private double valor;
	private Acessorio[] acessorios;

	public Veiculo() {
	}
	
	public Veiculo(String modelo, String montadora, int ano, double valor) {
		this.modelo = modelo;
		this.montadora = montadora;
		this.ano = ano;
		this.valor = valor;		
	}

	public Veiculo(String modelo, String montadora, int ano, double valor, Acessorio[] acessorios) {
		this.modelo = modelo;
		this.montadora = montadora;
		this.ano = ano;
		this.valor = valor;
		this.acessorios = acessorios;
	}
	
	public String getTudo(){
		NumberFormat nb = NumberFormat.getCurrencyInstance();
		return new StringJoiner(" - ")
				.add("Modelo:" + modelo)
				.add("Montadora:" + montadora)
				.add("Ano:" + ano)
				.add("Valor:" + nb.format(valor))
				.toString();
	}
	
	public int totalAcessorios(){
		return this.acessorios.length;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMontadora() {
		return montadora;
	}

	public int getAno() {
		return ano;
	}

	public double getValor() {
		return valor;
	}

	public Acessorio[] getAcessorios() {
		return acessorios;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setAcessorios(Acessorio[] acessorios) {
		this.acessorios = acessorios;
	}

}
