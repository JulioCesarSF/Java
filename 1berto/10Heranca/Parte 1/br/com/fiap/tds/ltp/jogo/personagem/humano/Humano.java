package br.com.fiap.tds.ltp.jogo.personagem.humano;

import br.com.fiap.tds.ltp.jogo.personagem.Personagem;

public class Humano extends Personagem{
	
	private String classe;

	public Humano() {
		super();
		classe = new String();
	}
	
	public Humano(String nome, int forca, int inteligencia, int destreza, int level, String classe){
		super(nome, forca, inteligencia, destreza, level);
		this.classe = new String(classe);
	}
	
	String definirClasse(){
		return classe;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}	

}
