package br.com.fiap.beans;

public class Aluno {

	private String nome;
	private double media;
	private int faltas;
	private int idade;

	public Aluno(String nome, double meida, int faltas, int idade) {
		this.nome = nome;
		this.media = meida;
		this.faltas = faltas;
		this.idade = idade;
	}

	public Aluno() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public double getMedia() {
		return media;
	}

	public int getFaltas() {
		return faltas;
	}

	public int getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
