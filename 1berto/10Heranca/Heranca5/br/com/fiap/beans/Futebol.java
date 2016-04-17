package br.com.fiap.beans;

public class Futebol extends Esporte {
	
	private String nomeCampo;
	private double tamanhoCampo;

	public Futebol() {
		nomeCampo = new String();
		tamanhoCampo = 0.0;
	}
	
	public Futebol(String nomeTime, String corUniforme, int jogadoresNoTime,
			String nomeCampo, double tamanhoCampo){
		super(nomeTime, corUniforme, jogadoresNoTime);
		this.nomeCampo = new String(nomeCampo);
		this.tamanhoCampo = tamanhoCampo;
	}
	
	public String exibirTudo(){
		String retorno = new String(
				"Nome Time:\t" + super.getNomeTime()
				+"\nCor Uniforme:\t" + super.getCorUniforme()
				+"\nJogadores no time:\t" + super.getJogadoresNoTime()
				+"\nNome do Campo:\t" + nomeCampo
				+"\nTamanho ddo Campo:\t" + tamanhoCampo);
		return retorno;
	}

	public String getNomeCampo() {
		return nomeCampo;
	}

	public void setNomeCampo(String nomeCampo) {
		this.nomeCampo = nomeCampo;
	}

	public double getTamanhoCampo() {
		return tamanhoCampo;
	}

	public void setTamanhoCampo(double tamanhoCampo) {
		this.tamanhoCampo = tamanhoCampo;
	}
	
	

}
