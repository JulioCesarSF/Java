package br.com.fiap.beans;

import java.util.StringJoiner;

public class Cargo {
	
	private String cargo, nivel;
	private double salario;
	
	public Cargo(){super();}
	
	public Cargo(String cargo, String nivel, double salario){
		this.cargo = new String(cargo);
		this.nivel = new String(nivel);
		this.salario = salario;
	}
	
	/*@Override
	public int compareTo(Cargo outro) {
		if(this.salario < outro.salario){
			return -1;
		}
		if(this.salario > outro.salario){
			return 1;
		}		
		
		return 0;		
	}*/
	
	public String getTudo(){
		return new StringJoiner(" - ").add(cargo).add("Nível: "+nivel).add("Salário: "+salario).toString();
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
