package descansos.Ebook;

public class Cliente {
	
	/* private : só os métodos dessa classe podem acessar/alterar os atributos
	 * static : quero que em qualquer instancia de objeto o cliente seja o mesmo
	 * 
	 * 
	 * */
	private static String nome, endereco, email;
	private static int telefone;	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		Cliente.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		Cliente.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		Cliente.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		Cliente.telefone = telefone;
	}

}
