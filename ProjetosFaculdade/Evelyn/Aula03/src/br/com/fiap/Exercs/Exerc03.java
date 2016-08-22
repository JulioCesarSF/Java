package br.com.fiap.Exercs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {		

		try (Scanner t = new Scanner(System.in)) {

			double[][] notas = new double[10][4];			
			
			double media = 0d;

			for (int i = 0; i < notas.length; i++) {
				System.out.println("Aluno:" + i);
				media = 0d;
				for (int j = 0; j < 3; j++) {
					System.out.println("Informe a nota da " + (j + 1) + "a. Prova:");
					notas[i][j] = t.nextDouble();
					media += notas[i][j];
				}
				media /= 3;
				notas[i][3] = media;
			}

			System.out.println("Média dos Estudantes na Disciplina");

			DecimalFormat df = new DecimalFormat("0.#");

			for (int i = 0; i < notas.length; i++) {
				System.out.println("Aluno " + (i + 1) + " Média:" + df.format(notas[i][3]));
			}

		} catch (Exception e) {
			System.out.println("Erro: " + e);
		} finally {
			System.out.println("Fim da execução.");
		}

	}

}
