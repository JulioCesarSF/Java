package br.com.fiap.Banco;

public class Titular {
	
	private String nome, cpf;

	public Titular() {
		nome = new String();
		cpf = new String();
	}
	
	public Titular(String nome, String cpf){
		this.nome = new String(nome);
		this.cpf = new String(cpf);
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public String getCpf(){
		return cpf;
	}

}
