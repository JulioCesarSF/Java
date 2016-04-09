package teste;

import modelos.Aluno;
import modelos.ListaAluno;

public class Teste {

	public static void main(String[] args) {
		ListaAluno lista = new ListaAluno();
		
		lista.addAluno(lista.getListaAlunos(), new Aluno("G"));
		lista.addAluno(lista.getListaAlunos(), new Aluno("F"));
		lista.addAluno(lista.getListaAlunos(), new Aluno("A"));
		
		
		lista.ordenar();
		lista.listar();
		

	}

}
