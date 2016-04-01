package descansos.Ebook;

public class Ebook {
	
	private String titulo;
	private int isbn;
	private double valor;
	
	private Autor autor;
	private Editora editora;
	
	public Ebook(){
		Autor autor = new Autor();
		Editora editora = new Editora();
		this.autor = autor;
		this.editora = editora;
	}
	
	public Ebook(String titulo, int isbn, double valor, Autor autor, Editora editora) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.valor = valor;
		this.autor = autor;
		this.editora = editora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	public void setEditoraRazaoSocial(String nome){
		this.editora.setRazaoSocial(nome);
	}
	
	public void setEditoraCnpj(String cnpj){
		this.editora.setCpnj(cnpj);
	}
	
	public void setEditoraEndereco(String endereco){
		this.editora.setEndereco(endereco);
	}
	
	public void setAutorNome(String nome){
		this.autor.setNome(nome);
	}
	
	public void setAutorEndereco(String endereco){
		this.autor.setEndereco(endereco);
	}
	
	public void setAutorEmail(String email){
		this.autor.setEmail(email);
	}
	
	public String getAll(){
		return "Ebook: \n" 
				+ "Título: " + this.titulo + "\n"
				+ "ISBN: " + this.isbn + "\n"
				+ "Valor: R$ " + this.valor + "\n"
				+ this.autor.getAll() + "\n"
				+ this.editora.getAll();
	}
	

}
