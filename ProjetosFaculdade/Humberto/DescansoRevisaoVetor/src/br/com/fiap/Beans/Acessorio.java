package br.com.fiap.Beans;

public class Acessorio {
	
	private String descricao;
	private double valor;
	
	public Acessorio(){}
	
	public Acessorio(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}

