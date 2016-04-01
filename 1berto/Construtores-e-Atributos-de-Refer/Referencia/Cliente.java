package descanso.Mod;

public class Cliente {
	
	private String nome, email;
	private Endereco endereco;
	private Telefone fone;
	
	public Cliente(){}
	
	public Cliente(String nome, String email, Telefone fone, Endereco endereco){
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	

	public Telefone getFone() {
		return fone;
	}

	public void setFone(Telefone fone) {
		this.fone = fone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
