package br.com.fiap.exercs;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {

		double[][] v = new double[5][4]; // 5 lojas, 4 semanas cada
		double[] vMes = new double[4];
		double[] vSemana = new double[4];

		double total = 0d;

		try (Scanner t = new Scanner(System.in)) {
			double totalMes = 0d;
			for (int i = 0; i < v.length; i++) {
				for (int j = 0; j < 4; j++) {
					a("Digite o valor da venda da loja " + (i + 1) + " semana " + (j + 1) + ":");
					v[i][j] = t.nextDouble();
					totalMes += v[i][j];
				}
				if (i < v.length - 1) {
					vMes[i] = totalMes;
					vSemana[i] = vMes[i] / vMes.length;
					total += vSemana[i];
				}
			}

			NumberFormat n = NumberFormat.getCurrencyInstance();
			for (int i = 0; i < vMes.length; i++)
				a("O faturamento da loja " + (i + 1) + ":" + n.format(vMes[i]));

			for (int i = 0; i < vSemana.length; i++)
				a("Total por semana " + (i + 1) + ":" + n.format(vSemana[i]));

			a("Faturamento por semana todas as lojas: " + n.format(total));

		} catch (Exception e) {
			System.out.println("Erro:\t" + e);
			e.printStackTrace();
		}

	}

	public static void a(String q) {
		System.out.println(q);
	}

}
