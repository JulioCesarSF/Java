package br.com.fiap.exercs;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {

		int[][] a = new int[5][3];
		int posAMaior = 0;
		int maior = Integer.MIN_VALUE;

		int posAMenor = 0;
		int menor = Integer.MAX_VALUE;

		try (Scanner t = new Scanner(System.in)) {

			for (int i = 0; i < a.length - 1; i++) {
				System.out.println("--- Estoque no armazem (" + (i + 1) + ") ---");
				for (int j = 0; j < 3; j++) {
					System.out.print("Informe a quantidade em estoque do Produto (" + (j + 1) + "):\t");
					a[i][j] = t.nextInt();
					if (j == 1 && a[i][j] > maior) {
						posAMaior = (i + 1);
						maior = a[i][j];
					}
					if (a[i][j] < menor) {
						posAMenor = (i + 1);
						menor = a[i][j];
					}
				}
			}

			/* custo */
			System.out.println("---- CUSTO DE CADA PRODUTO");
			for (int i = 0; i < 3; i++) {
				System.out.print("Custo do produto (" + (i + 1) + ") : ");
				a[4][i] = t.nextInt();
			}

			/* a) */
			System.out.println("----------- QUANTIDADE DE ITENS EM CADA ARMAZEM -----------");
			for (int i = 0; i < a.length - 1; i++) {
				int total = 0;
				for (int j = 0; j < 3; j++) {
					total += a[i][j];
				}
				System.out.println("--- Estoque no armazem (" + (i + 1) + ") : " + total);
			}

			/* b) */
			System.out.println("---- ARMAZEM COM MAIOR ESTOQUE DO PRODUTO 2");
			System.out.println("---- Armazém (" + posAMaior + ") Quantidade em estoque:" + maior);

			/* c) */
			System.out.println("---- ARMAZEM COM MENOR ESTOQUE");
			System.out.println("---- Armazém (" + posAMenor + ") Quantidade em estoque:" + menor);

			/* d) */
			NumberFormat n = NumberFormat.getCurrencyInstance();
			System.out.println("---- CUSTO TOTAL DE CADA PRODUTO");
			for (int i = 0; i < 3; i++) {
				int total = 0;
				for (int j = 0; j < a.length - 1; j++) {
					total += a[j][i];
				}
				total *= a[4][i];
				System.out.println("Custo total do produto (" + (i + 1) + "): " + n.format(total));
			}

			/* e) */
			System.out.println("----- CUSTO TOTAL DE CADA ARMAZEM -----");

			for (int i = 0; i < a.length - 1; i++) {
				int total = 0;
				for (int j = 0; j < 3; j++) {
					int p = 0;
					p += a[i][j];
					p *= a[4][j];
					total += p;
				}
				System.out.println("Custo total no armazem (" + (i + 1) + "): " + n.format(total));
			}

		} catch (Exception e) {
			System.out.println("Erro:\t" + e);
		}

	}

}
