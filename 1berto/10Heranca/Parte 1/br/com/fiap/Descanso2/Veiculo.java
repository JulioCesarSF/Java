package br.com.fiap.Descanso2;

public class Veiculo {
	
	private String modelo;
	private int quantidadeLugares, anoFabricacao;
	private double comprimento;
	private Cor cor;
	

	public Veiculo() {
		modelo = new String();
		quantidadeLugares  = 0;
		anoFabricacao = 0;
		comprimento = 0.0;
		cor = new Cor();
	}
	
	public Veiculo(String modelo, int quantidadeLugares, int anoFabricacao, double comprimento, Cor cor){
		this.modelo = new String(modelo);
		this.quantidadeLugares = quantidadeLugares;
		this.anoFabricacao = anoFabricacao;
		this.comprimento = comprimento;
		this.cor = cor;
	}
	
	public Veiculo(String modelo, int quantidadeLugares, int anoFabricacao, double comprimento, 
			String nomeCor, int r, int g, int b){
		this.modelo = modelo;
		this.quantidadeLugares = quantidadeLugares;
		this.anoFabricacao = anoFabricacao;
		this.comprimento = comprimento;
		this.cor = new Cor(nomeCor, r, g, b);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQuantidadeLugares() {
		return quantidadeLugares;
	}

	public void setQuantidadeLugares(int quantidadeLugares) {
		this.quantidadeLugares = quantidadeLugares;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}	

}
