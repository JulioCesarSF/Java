package br.com.fiap.modelo;

public class Aluno {
	
	/* *** Atributos *** */
	
	private String nome, fone;
	private int rm;
	
	/* *** Construtores *** */
	
	public Aluno(){}
	
	public Aluno(String nome, String fone, int rm){
		this.nome = nome;
		this.fone = fone;
		this.rm = rm;
	}
	
	/* *** Métodos gerados pelo Eclipse *** 
	 * Menu: "Source" -> "Generate Getters and Setters..." -> "Select All" -> "OK"
	 * 
	 * */
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	
	

}
