package br.com.fiap.Exercs;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.StringJoiner;

public class Exerc04 {

	public static void main(String[] args) {		

		int[][] produto = new int[5][2];

		double[][] subTotal = new double[5][2];

		double totalGeral = 0d;
		
		try (Scanner t = new Scanner(System.in)) {

			for (int i = 0; i < produto.length; i++) {
				System.out.println("Produto " + (i + 1));
				double d = 0d;

				for (int j = 0; j < 2; j++) {

					switch (j) {
					case 0:
						System.out.print("Digite o código:");
						produto[i][j] = t.nextInt();
						System.out.print("Digite o preço:");
						subTotal[i][j] = t.nextDouble();
						d = subTotal[i][j];
						break;

					case 1:
						System.out.print("Digite a quantidade:");
						produto[i][j] = t.nextInt();
						subTotal[i][j] = produto[i][j] * d; // subTotal
						totalGeral += subTotal[i][j];
						break;

					default:
						break;
					}
				}

				System.out.println("");
			}
			
			NumberFormat nb = NumberFormat.getCurrencyInstance();

			for (int i = 0; i < produto.length; i++) {
				System.out.println(new StringJoiner("\t").add("Código:" + produto[i][0]).add("Preço:" + nb.format(subTotal[i][0]))
						.add("Quantidade:" + produto[i][1]).add("Total:" + nb.format(subTotal[i][1])).toString());
			}

			System.out.println("Total Geral:" + nb.format(totalGeral));

		} catch (Exception e) {
			System.out.println("Erro: " + e);
		} finally {
			System.out.println("Fim da execução.");
		}

	}

}
