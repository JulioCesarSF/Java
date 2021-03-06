package br.com.fiap.teste.exercs;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		
		String[] nomes = new String[5];
		double[] salario = new double[5];
		int[] tempo = new int[5];

		try (Scanner t = new Scanner(System.in)) {

			for (int i = 0; i < nomes.length; i++) {

				System.out.println("Informe o nome do funcion�rio");
				nomes[i] = new String(t.next());
				System.out.println("Informe o sl�rio do funcion�rio");
				salario[i] = t.nextDouble();
				System.out.println("Informe o tempo de servi�o do funcion�rio");
				tempo[i] = t.nextInt();

			}

			System.out.println("-> N�o ter�o aumento");
			for (int i = 0; i < tempo.length; i++) {
				if (tempo[i] <= 5 || salario[i] >= 780)
					System.out.println(nomes[i]);
			}

			System.out.println("-> Ter�o aumento");
			for (int i = 0; i < tempo.length; i++) {
				if (tempo[i] > 5 && salario[i] < 780)
					System.out
							.println("Nome:\t" + nomes[i] + " - novo sal�rio R$" + (salario[i] + (salario[i] * 0.35)));
				else if (tempo[i] > 5)
					System.out
							.println("Nome:\t" + nomes[i] + " - novo sal�rio R$" + (salario[i] + (salario[i] * 0.25)));
				else if (salario[i] < 780)
					System.out
							.println("Nome:\t" + nomes[i] + " - novo sal�rio R$" + (salario[i] + (salario[i] * 0.15)));
			}

		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}

	}

}
