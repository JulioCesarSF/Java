package br.com.fiap.Beans;

public class CompactDisc extends Produto {
	
	private String gravadora, artista;

	public CompactDisc() {
		super();
		gravadora = new String();
		artista = new String();
	}
	
	public CompactDisc(int codigo, double preco, String descricao, String gravadora, String artista){
		super(codigo, preco, descricao);
		this.gravadora = new String(gravadora);
		this.artista = new String(artista);
	}
	
	public String getGravadora(){
		return gravadora;
	}
	
	public String getArtista(){
		return artista;
	}
	
	public void setGravadora(String gravadora){
		this.gravadora = gravadora;
	}
	
	public void setArtista(String artista){
		this.artista = artista;
	}

}
