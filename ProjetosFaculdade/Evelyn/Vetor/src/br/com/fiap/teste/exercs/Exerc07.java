package br.com.fiap.teste.exercs;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {

		double[] preco = new double[10];
		int[] qtd = new int[10];

		try (Scanner t = new Scanner(System.in)) {
			for (int i = 0; i < preco.length; i++) {

				System.out.println("Informe o pre�o unit�rio:");
				preco[i] = t.nextDouble();

				System.out.println("Informe a qtd vendidade:");
				qtd[i] = t.nextInt();
			}

			double totalGeral = 0d;
			int maiorQtd = 0;
			for (int i = 0; i < preco.length; i++) {
				System.out.println("Qtde:" + qtd[i] + "\tPreço: R$" + preco[i] + "\tTotal: R$" + (qtd[i] * preco[i]));
				totalGeral += (qtd[i] * preco[i]);
				if (qtd[i] > maiorQtd)
					maiorQtd = i;
			}

			System.out.println("Total geral: R$" + totalGeral);
			System.out.println("Comissão: R$" + (totalGeral * 0.05));
			System.out.println("Pre�o da maior quantidade R$" + preco[maiorQtd]);

		} catch (Exception e) {
			System.out.println("Erro:" + e);
		}

	}

}
