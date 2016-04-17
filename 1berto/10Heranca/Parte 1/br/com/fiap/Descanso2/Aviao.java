package br.com.fiap.Descanso2;

public class Aviao extends Veiculo {
	
	private String prefixo;
	private int quantidadeTurbinas;

	public Aviao() {
		super();
		prefixo = new String();
		quantidadeTurbinas = 0;
	}
	
	public Aviao(String modelo, int quantidadeLugares, int anoFabricacao, double comprimento, Cor cor, 
			String prefixo, int quantidadeTurbinas) {
		super(modelo, quantidadeLugares, anoFabricacao, comprimento, cor);
		this.prefixo = new String(prefixo);
		this.quantidadeTurbinas = quantidadeTurbinas;
	}
	
	public Aviao(String modelo, int quantidadeLugares, int anoFabricacao, double comprimento, 
			String nomeCor, int r, int g, int b, 
			String prefixo, int quantidadeTurbinas) {
		super(modelo, quantidadeLugares, anoFabricacao, comprimento, nomeCor, r, g, b);
		this.prefixo = new String(prefixo);
		this.quantidadeTurbinas = quantidadeTurbinas;
	}

	public String getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}

	public int getQuantidadeTurbinas() {
		return quantidadeTurbinas;
	}

	public void setQuantidadeTurbinas(int quantidadeTurbinas) {
		this.quantidadeTurbinas = quantidadeTurbinas;
	}
}
