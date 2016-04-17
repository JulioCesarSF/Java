package br.com.fiap.tds.ltp.pacotes.ex2.produtos.cd;

import br.com.fiap.tds.ltp.pacotes.ex2.produtos.Produto;

public class Cd extends Produto{
	
	private String artista, album;

	public Cd() {
		super();
		artista = new String();
		album = new String();
	}
	
	public Cd(String artista, String album){
		super();
		this.artista = new String(artista);
		this.album = new String(album);
	}
	
	public Cd(int codigo, int preco, String artista, String album){
		super(codigo, preco);
		this.artista = new String(artista);
		this.album = new String(album);
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

}
