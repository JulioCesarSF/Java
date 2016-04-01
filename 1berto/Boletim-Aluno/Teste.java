package br.com.fiap.teste;

/* pode usar o CTRL+SHIFT+O para importar Menu: "Source" -> "Organize Imports"
 * import br.com.fiap.modelo.Aluno;
 * import br.com.fiap.modelo.Boletim; * 
 * */

import br.com.fiap.modelo.*; 

public class Teste {

	public static void main(String[] args) {
		
		/* objeto Aluno, dei o nome de "a" para a "váriavel referência" */
		
		Aluno a = new Aluno();
		
		a.setNome("Aluno1");
		a.setRm(213132);
		a.setFone("1234321");
		
		/* objeto Boletim, dei o nome de "b" para a "váriavel referência" */
		
		Boletim b = new Boletim();
		
		/* 						IMPORTANTE (PROVA):
		 * 
		 * Não esquecer de atribuir valor para o atributo aluno da classe Boletim
		 * Se não atribuir valor vai gerar uma Exception (NullPointerException)
		 * pois ele espera um objeto Aluno
		 * b.setAluno(a);
		 * */
		
		b.setAluno(a);
		b.setFaltas(0);
		b.setNota1(10);
		b.setNota2(9.5);		
		
		/* 						IMPORTANTE (PROVA):
		 * 
		 * Exibir informações do Aluno pelo objeto Boletim:		 * 						
		 * 
		 * Existe uma diferença entre chamar os atributos do Aluno pelo Boletim
		 * b.getAluno().getNome()
		 * e
		 * Chamar os atributos do Aluno diretamente pelo objeto do Aluno.
		 * a.getNome()
		 * 
		 * >>>> Se chamar diretamente pelo Aluno fica sem "conexão" com o Boletim. <<<<
		 * 
		 * Portanto, não faça isso: System.out.print("Nome aluno: " + a.getNome());
		 * E sim: System.out.print("Nome aluno: " + b.getAluno().getNome());
		 * 
		 * * "\n" é pular linha
		 * 
		 */
		
		System.out.println("->Dados Pessoais: \n"
				+ "Nome: " + b.getAluno().getNome() + "\n"
				+ "RM: " + b.getAluno().getRm() + "\n"
				+ "Fone: " + b.getAluno().getFone() + "\n");
		
		/* Exibir notas e média */
		
		System.out.println("->Boletim : "
						+ "\nFaltas: " + b.getFaltas()
						+ "\nNota1: "+ b.getNota1()
						+ "\nNota2: " + b.getNota2()
						+ "\nMédia: " + b.exibirMedia());
		
		/* output:
		 * ->Dados Pessoais: 
			Nome: Aluno1
			RM: 213132
			Fone: 1234321
			
			->Boletim : 
			Faltas: 0
			Nota1: 10.0
			Nota2: 9.5
			Média: 9.75
		 * 
		 * */
		 
		 /* *** EXEMPLO 2 ***
		 * Pedindo informação ao usuário
		 * 
		 */
		
		b.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota1")));
		b.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota2")));
		
		/* Exibir notas e média */
		
		System.out.println("->Boletim : "
						+ "\nFaltas: " + b.getFaltas()
						+ "\nNota1: "+ b.getNota1()
						+ "\nNota2: " + b.getNota2()
						+ "\nMédia: " + b.exibirMedia());

	}

}
