package br.com.fiap.Descanso2;

public class Lancha extends Veiculo {
	
	private int quantidadeMotores;

	public Lancha() {
		super();
		quantidadeMotores = 0;		
	}
	
	public Lancha(String modelo, int quantidadeLugares, int anoFabricacao, double comprimento, Cor cor, 
			int quantidadeMotores){
		super(modelo, quantidadeLugares, anoFabricacao, comprimento, cor);
		this.quantidadeMotores = quantidadeMotores;
	}
	
	public Lancha(String modelo, int quantidadeLugares, int anoFabricacao, double comprimento, 
			String nomeCor, int r, int g, int b,
			int quantidadeMotores){
		super(modelo, quantidadeLugares, anoFabricacao, comprimento, nomeCor, r, g, b);
		this.quantidadeMotores = quantidadeMotores;
	}

	public int getQuantidadeMotores() {
		return quantidadeMotores;
	}

	public void setQuantidadeMotores(int quantidadeMotores) {
		this.quantidadeMotores = quantidadeMotores;
	}	

}
