package br.com.fiap.exercs;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {

		int[][] m = new int[2][2];
		int[][] r = new int[2][2];
		int maior = 0;

		try (Scanner t = new Scanner(System.in)) {

			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m.length; j++) {
					System.out.print("Informe um número M[" + (i + 1) + "," + (j + 1) + "]=");
					m[i][j] = t.nextInt();
					if (m[i][j] > maior)
						maior = m[i][j];
				}
			}

			for (int i = 0; i < m.length; i++)
				for (int j = 0; j < m.length; j++) {
					r[i][j] = m[i][j] * maior;
					System.out.println("Resultado - Matriz R[" + (i + 1) + "," + (j + 1) + "]=" + r[i][j]);
				}

		} catch (Exception e) {
			System.out.println("Erro; " + e);
		}

	}

}
