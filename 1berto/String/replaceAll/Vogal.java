package br.descanso.modelo;

public class Vogal {
	
	private String palavra = null;
	
	public Vogal(){
		this.palavra = new String();
	}
	
	public Vogal(String palavra){
		this.palavra = new String(palavra);
	}
	
	public String trocarLetras(){		
		return this.palavra.replaceAll("[aeiou]", "*");		
	}
	
	public String trocarLetras(String palavra){
		return palavra.replaceAll("[aeiou]", "*");	
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	

}
