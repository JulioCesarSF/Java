package br.com.fiap.beans;

public class Polo extends Esporte{
	
	private int quantidadeCavalos, quantidadeTacos;

	public Polo() {
		quantidadeCavalos = 0;
		quantidadeTacos = 0;
	}
	
	public Polo(String nomeTime, String corUniforme, int jogadoresNoTime,
			int quantidadeCavalos, int quantidadeTacos){
		super(nomeTime, corUniforme, jogadoresNoTime);
		this.quantidadeCavalos = quantidadeCavalos;
		this.quantidadeTacos = quantidadeTacos;
	}
	
	public String exibirTudo(){
		String retorno = new String(
				"Nome Time:\t" + super.getNomeTime()
				+"\nCor Uniforme:\t" + super.getCorUniforme()
				+"\nJogadores no time:\t" + super.getJogadoresNoTime()
				+"\nQuantidade de cavalos:\t" + quantidadeCavalos
				+"\nQuantidade de tacos:\t" + quantidadeTacos);
		return retorno;
	}

	public int getQuantidadeCavalos() {
		return quantidadeCavalos;
	}

	public void setQuantidadeCavalos(int quantidadeCavalos) {
		this.quantidadeCavalos = quantidadeCavalos;
	}

	public int getQuantidadeTacos() {
		return quantidadeTacos;
	}

	public void setQuantidadeTacos(int quantidadeTacos) {
		this.quantidadeTacos = quantidadeTacos;
	}
}
