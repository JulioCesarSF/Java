package br.com.fiap.modelo;

public class Boletim {
	
	/* *** Atributos *** */
	
	private Aluno aluno;
	private int faltas;
	private double nota1, nota2;
	
	/* *** Meus métodos *** */
	
	public double exibirMedia(){
		/* Precisa colocar entre parênteses senão ele faz outra conta
		 *  nota1 + nota2/2, ele vai dividir nota2 primeiro e depois somar com nota1
		 *  (nota1 + nota2)/2 ele vai somar as notas e depois dividir		 * 
		 * */
		return (nota1 + nota2)/2;
	}
	
	public void setNotas(double nota1, double nota2){
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	/* *** Métodos gerados pelo Eclipse *** */
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}	

}
