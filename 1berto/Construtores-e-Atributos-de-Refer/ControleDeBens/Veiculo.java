package br.com.fiap.bens;

public class Veiculo {
	
	private String modelo, motor;
	private int qtdePortas;	
	
	public Veiculo() {}
	
	public Veiculo(String modelo, String motor, int qtdePortas) {	
		this.modelo = modelo;
		this.motor = motor;
		this.qtdePortas = qtdePortas;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public int getQtdePortas() {
		return qtdePortas;
	}
	public void setQtdePortas(int qtdePortas) {
		this.qtdePortas = qtdePortas;
	}	

}
