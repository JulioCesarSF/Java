package br.com.fiap.Beans;

public class Produto {
	
	private int codigo;
	private double preco;
	private String descricao;

	public Produto() {
		codigo = 0;
		preco = 0.0;
		descricao = new String();
	}
	
	public Produto(int codigo, double preco, String descricao){
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = new String(descricao);
	}

	public int getCodigo() {
		return codigo;
	}	

	public double getValor() {
		return preco;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
