package br.com.fiap.beans;

public class Esporte {
	
	private String nomeTime, corUniforme;
	private int jogadoresNoTime;
	
	/* enunciado 5.2 pag 31 arquivo 10, não entendi o que pede
	private Esporte esporte = new Esporte();

	public Esporte getEsporte() {
		return esporte;
	}

	public void setEsporte(Esporte esporte) {
		this.esporte = esporte;
	}
	fim enunciado 5.2 */

	public Esporte() {
		nomeTime = new String();
		corUniforme = new String();
		jogadoresNoTime = 0;
	}
	
	public Esporte(String nomeTime, String corUniforme, int jogadoresNoTime){
		this.nomeTime = new String(nomeTime);
		this.corUniforme = new String(corUniforme);
		this.jogadoresNoTime = jogadoresNoTime;
	}	

	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public int getJogadoresNoTime() {
		return jogadoresNoTime;
	}

	public void setJogadoresNoTime(int jogadoresNoTime) {
		this.jogadoresNoTime = jogadoresNoTime;
	}

	public String getCorUniforme() {
		return corUniforme;
	}

	public void setCorUniforme(String corUniforme) {
		this.corUniforme = corUniforme;
	}	
}
