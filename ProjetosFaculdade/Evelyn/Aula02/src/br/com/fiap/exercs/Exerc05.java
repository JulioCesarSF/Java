package br.com.fiap.exercs;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {

		String[] gabarito = new String[8];
		int nota = 0;
		int nAluno = 0;
		int aprovados = 0;

		try (Scanner t = new Scanner(System.in)) {

			for (int i = 0; i < gabarito.length; i++) {
				System.out.println("Digite a reposta da questao " + (i + 1));
				gabarito[i] = t.nextLine();
			}

			for (int i = 0; i < 2; i++) {
				System.out.println("Digite o numero do " + (i + 1) + " aluno: ");
				nAluno = t.nextInt();
				nota = 0;
				String r = new String();
				for (int j = 0; j < 8; j++) {
					System.out.println("Digite a reposta dada pelo aluno " + nAluno + "à " + (j + 1) + " questão:");
					r = t.next();
					if (gabarito[j].equalsIgnoreCase(r))
						nota++;
				}

				aprovados = (nota >= 6) ? aprovados + 1 : aprovados;				
				System.out.println("A nota do aluno " + nAluno + " foi:" + nota);
			}
			
			float p = (aprovados / 10) * 100;
			System.out.println("Percetagem de aprovados : " + p);

		} catch (Exception e) {
			System.out.println("Erro:" + e);
		} finally {
			System.out.println("Fim da execução!");
		}

	}

}
