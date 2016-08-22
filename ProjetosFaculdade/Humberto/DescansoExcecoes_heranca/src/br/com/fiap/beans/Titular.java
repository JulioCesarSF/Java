package br.com.fiap.beans;

public final class Titular {
	private String nome, cpf;
	
	public Titular(){
		nome = null;
		cpf = null;
	}
	
	public Titular(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getTudo(){
		return "Nome:\t" + nome + "\nCPF:\t" + cpf; 
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	

}
