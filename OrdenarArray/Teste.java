package teste;

import modelos.Aluno;
import modelos.ListaAluno;

public class Teste {

	public static void main(String[] args) {
		
		try{
			ListaAluno lista = new ListaAluno();
			
			lista.addAluno(lista.getListaAlunos(), new Aluno("G"));
			lista.addAluno(lista.getListaAlunos(), new Aluno("F"));
			lista.addAluno(lista.getListaAlunos(), new Aluno("A"));
			
			System.out.println("Teste 1 não ordenada:");
			lista.listar();		
			
			System.out.println("Teste 1 ordenada:");
			lista.ordenar();		
			lista.listar();		
			
			System.out.println("Teste 2 não ordenada:");
			lista.addAluno(new Aluno("Z"));
			lista.addAluno(new Aluno("W"));
			lista.addAluno(new Aluno("B"));		
			lista.listar();
			
			System.out.println("Teste 2 ordenada:");		
			lista.ordenar();		
			lista.listar();			
		}
		catch(Exception e){
			System.out.println("Ocorreu um problema: " + e.getMessage());
		}

	}

}
