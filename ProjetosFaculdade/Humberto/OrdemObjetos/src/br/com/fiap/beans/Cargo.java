package br.com.fiap.beans;

import java.util.StringJoiner;

public class Cargo implements Comparable<Cargo>{

	private String cargo, nivel;
	private double salario;

	public Cargo() {
	}

	public Cargo(String cargo, String nivel, double salario) {
		super();
		this.cargo = cargo;
		this.nivel = nivel;
		this.salario = salario;
	}
	
	@Override
	public int compareTo(Cargo o) {
		return this.cargo.compareTo(o.cargo)*-1;
	}

	public String getTudo() {
		return new StringJoiner(" - ")
				.add(cargo)
				.add("Nível:"+ nivel)
				.add("Salário:" + salario)
				.toString().toUpperCase();
	}

	public String getCargo() {
		return cargo;
	}

	public String getNivel() {
		return nivel;
	}

	public double getSalario() {
		return salario;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
