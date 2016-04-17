package br.com.fiap.Beans;

public class Livro extends Produto {
	
	private String isbn, autor;

	public Livro() {
		super();
		isbn = new String();
		autor = new String();
	}
	
	public Livro(int codigo, double preco, String descricao, String isbn, String autor){
		super(codigo, preco, descricao);
		this.isbn = new String(isbn);
		this.autor = new String(autor);
	}
	
	public String getIsbn(){
		return isbn;
	}
	
	public String getIsbnNumeros(){
		return isbn.replaceAll("-", "");
	}
	
	public int getIsbnInt(){ //remove o primeiro zero pq converteu para int
		return Integer.parseInt(isbn.replaceAll("-", ""));
	}
	
	public String getAutor(){
		return autor;
	}
	
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	
	public void setAutor(String autor){
		this.autor = autor;
	}

}
