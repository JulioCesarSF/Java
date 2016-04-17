package br.com.fiap.beans;

public class Basquete extends Esporte{
	
	private String nomeQuadra;
	private double tamanhoQuadra;

	public Basquete() {
		nomeQuadra = new String();
		tamanhoQuadra = 0.0;
	}
	
	public Basquete(String nomeTime, String corUniforme, int jogadoresNoTime,
			String nomeQuadra, double tamanhoQuadra){
		super(nomeTime, corUniforme, jogadoresNoTime);
		this.nomeQuadra = new String(nomeQuadra);
		this.tamanhoQuadra = tamanhoQuadra;
	}
	
	public String exibirTudo(){
		String retorno = new String(
				"Nome Time:\t" + super.getNomeTime()
				+"\nCor Uniforme:\t" + super.getCorUniforme()
				+"\nJogadores no time:\t" + super.getJogadoresNoTime()
				+"\nNome da Quadra:\t" + nomeQuadra
				+"\nTamanho da Quadra:\t" + tamanhoQuadra);
		return retorno;
	}

	public String getNomeQuadra() {
		return nomeQuadra;
	}

	public void setNomeQuadra(String nomeQuadra) {
		this.nomeQuadra = nomeQuadra;
	}

	public double getTamanhoQuadra() {
		return tamanhoQuadra;
	}

	public void setTamanhoQuadra(double tamanhoQuadra) {
		this.tamanhoQuadra = tamanhoQuadra;
	}
}
