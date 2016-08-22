package br.com.fiap.beans;

public class ItemPedido {
	
	private Pedido pedido;
	private Produto produto;
	private int quantidade;
	private double valorUnitario;
	
	
	public ItemPedido() {
		super();
	}
	public ItemPedido(Pedido pedido, Produto produto, int quantidade, double valorUnitario) {
		super();
		this.pedido = pedido;
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public String getTudo(){
		return pedido.getTudo() + "\n" + produto.getTudo() + "\n" + quantidade + "\n" + valorUnitario;
	}
	
	
	
	
	
}
