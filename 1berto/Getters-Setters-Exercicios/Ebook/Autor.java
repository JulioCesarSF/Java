package descansos.Ebook;

public class Autor {
	
	private String nome, endereco, email;
	
	
	
	public Autor() {
	}

	public Autor(String nome, String endereco, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAll(){
		return "Autor: \n"
				+ "Nome: " + this.nome + "\n"
				+ "Endereço: " + this.endereco + "\n"
				+ "E-mail: " + this.email;				
	}

}
