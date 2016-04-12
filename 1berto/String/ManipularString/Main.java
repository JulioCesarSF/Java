package teste;

import beans.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Aluno a = new Aluno("RM201675583", 
				"Julio", 
				"julio.com@uol.com.br", 
				"123.456.789-00");
		
		a.setSexo('m');
		a.setMensalidade(1030.80);
		
		System.out.println(a.getAll());	
		
		/* output
		Nome:	Julio
		RM:		RM201675583
		Email:	julio.com@uol.com.br
		CPF:	123.456.789-00
		Sexo:	M
		Mensalidade:	1.030,800000
		*/
		
	}

}
