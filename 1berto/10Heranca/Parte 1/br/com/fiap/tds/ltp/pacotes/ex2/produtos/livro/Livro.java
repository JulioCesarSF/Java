package br.com.fiap.tds.ltp.pacotes.ex2.produtos.livro;

import br.com.fiap.tds.ltp.pacotes.ex2.produtos.Produto;

public class Livro extends Produto{
	
	private String autor, titulo, isbn;

	public Livro() {
		super();
		autor = new String();
		titulo = new String();
		isbn = new String();
	}
	
	public Livro(int codigo, int preco, String autor, String titulo, String isbn){
		super(codigo, preco);
		this.autor = new String(autor);
		this.titulo = new String(titulo);
		this.isbn = new String(isbn);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
