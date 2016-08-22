package br.com.fiap.beans;

import java.text.NumberFormat;
import java.util.StringJoiner;

public class Funcionario implements Comparable<Funcionario> {

	private String nome, cargo;
	private double salario;
	private int faltas;

	public Funcionario() {
	}

	public Funcionario(String nome, String cargo, double salario, int faltas) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.faltas = faltas;
	}

	@Override
	//Crescente: this.salario < o.getSalario() ? -1 : (this.salario > o.getSalario() ? 1 : 0);
	//Decrescente: this.salario < o.getSalario() ? 1 : (this.salario > o.getSalario() ? -1 : 0);
	public int compareTo(Funcionario o) {
		return this.salario < o.getSalario() ? -1 : (this.salario > o.getSalario() ? 1 : 0);
	}
	
	public String getTudo(){
		NumberFormat n = NumberFormat.getCurrencyInstance();
		return new StringJoiner("\t-\t")
				.add("Nome:" + nome)
				.add("Cargo:" + cargo)
				.add("Sal�rio:" + n.format(salario))
				.add("Faltas:" + faltas)
				.toString();
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

}
