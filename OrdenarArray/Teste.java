package teste;

import modelos.Aluno;
import modelos.ListaAluno;

public class Teste {

	public static void main(String[] args) {
		
		try{
			ListaAluno lista = new ListaAluno();						
			
			lista.addAluno(new Aluno("Chardcen"));
			lista.addAluno(new Aluno("Wynsung"));
			lista.addAluno(new Aluno("Adelwald"));
			lista.addAluno(new Aluno("Isenfast"), true);				
			
			lista.listar();				
		}
		catch(Exception e){
			System.out.println("Ocorreu um problema: " + e);
		}

	}

}
