package br.descanso.modelo;

public class Maiuscula {
	
	private String palavra = null;
	
	public Maiuscula(){
		palavra = new String();
	}
	
	public Maiuscula(String palavra){
		this.palavra = new String(palavra);
	}
	
	/**
	 * 
	 * Deixar tudo em maiusculo
	 * 
	 * @return String atributo da classe
	 */
	public String palavraM(){ 
		return palavra.toUpperCase();
	}
	
		
	/** 
	 * 
	 * Deixar tudo em maiusculo
	 * 
	 * @param String palavra
	 * @return String : qualquer palavra (não atribui valor na classe)
	 */
	public String palavraM(String palavra){ 
		return palavra.toUpperCase();
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}	

}
