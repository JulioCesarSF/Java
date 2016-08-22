package br.com.fiap.teste;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {

		try (Scanner t = new Scanner(System.in)) {

			// criar matriz
			int[][] m = new int[3][3];

			// CARREGAR MATRIZ
			// controle das linhas
			for (int linha = 0; linha < 3; linha++) {
				// controle das colunas
				for (int coluna = 0; coluna < 3; coluna++) {
					System.out.println("Matriz [" + linha + "] - [" + coluna + "]:");
					m[linha][coluna] = t.nextInt();
				}
			}

			// EXIBIR MATRIZ
			System.out.println("EXIBIR MATRIZ");
			for (int linha = 0; linha < 3; linha++)
				for (int coluna = 0; coluna < 3; coluna++)
					System.out.println("Matriz [" + linha + "] - [" + coluna + "] = " + m[linha][coluna]);

			// EXIBIR MATRIZ
			System.out.println("EXIBIR MATRIZ");
			for (int linha = 0; linha < 3; linha++){
				for (int coluna = 0; coluna < 3; coluna++)
					System.out.print(m[linha][coluna] + "\t");
				System.out.println("");
			}

		} catch (Exception e) {
			System.out.println("erro: " + e);
		}

	}

}