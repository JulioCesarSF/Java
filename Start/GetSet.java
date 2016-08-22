package exemplos.modulos;

public class GetSet {
	
	private String nome;
	private int numeroInteiro;
	private double numeroComPonto;
	private boolean verdadeOuFalse;
	
	/*
	 * métodos get e set
	 * 
	 * o "get" vai retornar algo
	 * 
	 * o "set" vai atribuir um valor para algum atributo
	 * 
	 * O Eclipse pode gerar os get e set básicos para você, básico:
	 * "Source" -> "Generate Getters and Setters..." -> "Select All" -> "OK"
	 * 
	 * */
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroInteiro() {
		return numeroInteiro;
	}
	public void setNumeroInteiro(int numeroInteiro) {
		this.numeroInteiro = numeroInteiro;
	}
	public double getNumeroComPonto() {
		return numeroComPonto;
	}
	public void setNumeroComPonto(double numeroComPonto) {
		this.numeroComPonto = numeroComPonto;
	}
	public boolean isVerdadeOuFalse() {
		return verdadeOuFalse;
	}
	public void setVerdadeOuFalse(boolean verdadeOuFalse) {
		this.verdadeOuFalse = verdadeOuFalse;
	}
	
}
