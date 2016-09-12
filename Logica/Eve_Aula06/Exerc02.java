package br.com.fiap.listaI;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exerc02 {

	public static double calc(double totalGeral, int condicao) {
		if (condicao == 1) {
			return totalGeral-=totalGeral*0.1;
		} else if (condicao == 2) {
			return totalGeral-=totalGeral*0.05;
		} else if (condicao == 3) {
			return totalGeral/=2;
		} else {
			double parcela = (totalGeral + (totalGeral*0.1))/3;
			return parcela;
		}
	}
	
	public static String formatCalc(double total, int condicao){
		NumberFormat n = NumberFormat.getCurrencyInstance();
		if (condicao == 1) {
			return "À vista em dinheiro com 10% de desconto " + n.format(total);
		} else if (condicao == 2) {
			return "À vista com cartão de crédito, com 5% de desconto " + n.format(total);
		} else if (condicao == 3) {
			return "Em 2 vezes, total normal sem juros " + n.format(total);
		} else {
			return "Em 3 vezes, total com acréscimo de 10% " + n.format(total);
		}
	}

	public static void main(String[] args) {

		double[][] produto = new double[3][2];
		int codigo = 0;
		double totalGeral = 0d;

		try (Scanner t = new Scanner(System.in)) {

			for (int i = 0; i < produto.length; i++) {
				System.out.println(" --- Produto (" + (i + 1) + ") ---");
				
				System.out.print("Quantidade:");
				produto[i][0] = t.nextDouble();
				System.out.print("Preço unitário:");
				produto[i][1] = t.nextDouble();
				
				totalGeral += produto[i][0] * produto[i][1];
			}

			do {
				System.out.print("Código de condição de pagamento:");
				codigo = t.nextInt();
			} while (codigo <= 0 || codigo > 4);					
			
			System.out.println(" --- Total Geral --- ");
			System.out.println(formatCalc(calc(totalGeral, codigo), codigo));

		} catch (Exception e) {
			System.out.println("Erro: " + e);
			e.printStackTrace();
		}

	}
}
