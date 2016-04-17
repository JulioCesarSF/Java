package br.com.fiap.Descanso2;

public class Cor {
	
	private String cor;
	private int r, g, b;

	public Cor() {
		cor = new String();
		r  = 0;
		g = 0;
		b = 0;		
	}
	
	public Cor(int r, int g, int b){
		cor = new String();
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public Cor(String nome, int r, int g, int  b){
		this.cor = new String(nome);
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}	
}
