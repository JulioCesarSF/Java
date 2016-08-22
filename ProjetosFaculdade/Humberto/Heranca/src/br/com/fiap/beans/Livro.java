package br.com.fiap.beans;

public class Livro extends Produto {

	private String autor;
	private String editora;
	private int totalPaginas;
	
	
	public Livro() {
		super();
	}
	public Livro(String autor, String editora, int totalPaginas, String d, double v, int c) {
		super(d,v,c);
		this.autor = autor;
		this.editora = editora;
		this.totalPaginas = totalPaginas;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public int getTotalPaginas() {
		return totalPaginas;
	}


	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	
	public String getTudo(){
		return autor + "\n" + editora + "\n" + totalPaginas + "\n" + super.getTudo();
	}
	
	
	
	
	
	
	
	
	
}
