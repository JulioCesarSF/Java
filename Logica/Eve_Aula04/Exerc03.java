package br.com.fiap.exercs;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		String[] loja = new String[8];
		String[] produto = new String[4];
		double[][] preco = new double[4][8];

		try (Scanner t = new Scanner(System.in)) {

			for (int i = 0; i < loja.length; i++) {
				a("Informe o nome da loja " + (i + 1) + ":");
				loja[i] = new String(t.nextLine());
			}

			for (int i = 0; i < produto.length; i++) {
				a("Informe o nome do produto " + (i + 1) + ":");
				produto[i] = new String(t.nextLine());
			}

			al("-------------------------------------------------------");
			al("------------ Preços dos produtos por loja -------------");
			al("-------------------------------------------------------");

			for (int i = 0; i < produto.length; i++) {
				al("--- Produto: " + produto[i]);
				for (int j = 0; j < loja.length; j++) {
					a("Informe o preço do produto " + produto[i] + " na loja " + loja[j] + ":");
					preco[i][j] = t.nextDouble();
				}
			}

			al("-------------------------------------------------------");
			al("------- Produtos que custam menos de R$ 120,00 --------");
			al("-------------------------------------------------------");
			NumberFormat n = NumberFormat.getCurrencyInstance();
			for (int i = 0; i < produto.length; i++) {
				al("--- Produto: " + produto[i]);
				for (int j = 0; j < loja.length; j++) {
					if (preco[i][j] > 120)
						continue;
					al(" ------ Loja:" + loja[j] + " Preço: " + n.format(preco[i][j]));
				}
			}

		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}

	}

	public static void a(String q) {
		System.out.print(q);
	}

	public static void al(String q) {
		System.out.println(q);
	}

}
