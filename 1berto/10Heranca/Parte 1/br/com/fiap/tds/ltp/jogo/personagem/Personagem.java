package br.com.fiap.tds.ltp.jogo.personagem;

public class Personagem {
	
	private int forca, inteligencia, destreza, level;
	private String nome;

	public Personagem() {
		forca = 0;
		inteligencia = 0;
		destreza = 0;
		level = 0;
		nome = new String();
	}
	
	public Personagem(String nome, int forca, int inteligencia, int destreza, int level){
		this.nome = new String(nome);
		this.forca = forca;
		this.inteligencia = inteligencia;
		this.destreza = destreza;
		this.level = level;		
	}
	
	protected double subirLevel(){
		return (double)level++;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
