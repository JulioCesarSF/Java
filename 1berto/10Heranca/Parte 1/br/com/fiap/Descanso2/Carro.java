package br.com.fiap.Descanso2;

public class Carro extends Veiculo{
	
	private int quantidadePortas;
	private String placa;
	private float motor;
	
	public Carro(){
		super();
		placa = new String();
		motor = 1.0f;
	}
	
	public Carro(String modelo, int quantidadeLugares, int anoFabricacao, double comprimento, Cor cor, 
			int quantidadePortas, String placa, float motor) {
		super(modelo, quantidadeLugares, anoFabricacao, comprimento, 
			cor);
		this.quantidadePortas = quantidadePortas;
		this.placa = new String(placa);
		this.motor = motor;
	}

	public Carro(String modelo, int quantidadeLugares, int anoFabricacao, double comprimento, 
			String nomeCor, int r, int g, int b, 
			int quantidadePortas, String placa, float motor) {
		super(modelo, quantidadeLugares, anoFabricacao, comprimento, 
			nomeCor, r, g, b);
		this.quantidadePortas = quantidadePortas;
		this.placa = new String(placa);
		this.motor = motor;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getMotor() {
		return motor;
	}

	public void setMotor(float motor) {
		this.motor = motor;
	}	
}
