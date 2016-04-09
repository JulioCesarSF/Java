package modelos;

public class Aluno {
	
	private String nome;
	
	public Aluno(){
		nome = new String();
	}
	
	public Aluno(String nome){
		this.nome = new String(nome);
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}

}
