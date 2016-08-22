package br.com.fiap.beans;

public class Cd extends Produto{

	private String artista;
	private int totalFaixas;
	private double duracao;
	private boolean lancamento;
	

	public Cd(String artista, int totalFaixas, double duracao,
			boolean lancamento, String descricao, double valor, int codigo) {
		super(descricao, valor, codigo);
		this.artista = artista;
		this.totalFaixas = totalFaixas;
		this.duracao = duracao;
		this.lancamento = lancamento;
	}


	public Cd() {
		super();
	}
	
	
	
	
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getTotalFaixas() {
		return totalFaixas;
	}
	public void setTotalFaixas(int totalFaixas) {
		this.totalFaixas = totalFaixas;
	}
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	public boolean isLancamento() {
		return lancamento;
	}
	public void setLancamento(boolean lancamento) {
		this.lancamento = lancamento;
	}
	
	public String getTudo(){
		return artista + "\n" + totalFaixas + "\n" + duracao + "\n" + lancamento + "\n" + super.getTudo();
	}
	
	
	
	
	
}
