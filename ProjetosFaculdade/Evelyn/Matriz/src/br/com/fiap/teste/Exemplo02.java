package br.com.fiap.teste;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {

		try (Scanner t = new Scanner(System.in)) {

			int[][] n = new int[4][4];
			int[] s = new int[4];
			int[] c = new int[4];

			int sLinha = 0;
			int total = 0;
			int sColuna = 0;

			for (int i = 0; i < 4; i++) {
				System.out.println("Linha " + i);
				sLinha = 0;
				//sColuna = 0;
				for (int j = 0; j < 4; j++) {
					System.out.println("Digite um n�mero inteiro:");
					n[i][j] = t.nextInt();
					sLinha += n[i][j];
					sColuna += n[j][i];
				}
				c[i] = sColuna;
				s[i] = sLinha;
				total += sLinha;

			}

			for (int i = 0; i < 4; i++) {
				System.out.println("A soma da linha " + i + ": " + s[i]);
				System.out.println("A soma da coluna " + i + ": " + c[i]);
			}

			System.out.println("Soma total: " + total);

		} catch (Exception e) {
			System.out.println("Erro:" + e);
		}

	}

}
