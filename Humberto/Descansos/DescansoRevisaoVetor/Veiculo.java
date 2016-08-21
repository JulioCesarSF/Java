package br.com.fiap.beans;

import java.text.NumberFormat;
import java.util.StringJoiner;

public class Veiculo {
	
	private short ano;
	private String modelo, montadora;
	private double valor;
	private Acessorio[] acessorios;
	
	public Veiculo(){}
	
	public Veiculo(short ano, String modelo, String montadora, double valor) {
		this.ano = ano;
		this.modelo = modelo;
		this.montadora = montadora;
		this.valor = valor;
		this.acessorios = null;
	}
	
	public Veiculo(short ano, String modelo, String montadora, double valor, Acessorio[] acessorios) {
		this.ano = ano;
		this.modelo = modelo;
		this.montadora = montadora;
		this.valor = valor;
		this.acessorios = acessorios;
	}
	
	public String getTudo(){
		NumberFormat n = NumberFormat.getCurrencyInstance();
		return new StringJoiner(" - ")
				.add("Montadora:\t" + montadora)
				.add("Modelo:\t" + modelo)
				.add("Ano:\t" + ano)
				.add("Valor:\t" + n.format(valor))
				.toString().toUpperCase();
	}

	public short getAno() {
		return ano;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMontadora() {
		return montadora;
	}

	public double getValor() {
		return valor;
	}

	public Acessorio[] getAcessorios() {
		return acessorios;
	}

	public void setAno(short ano) {
		this.ano = ano;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setAcessorios(Acessorio[] acessorios) {
		this.acessorios = acessorios;
	}
}
