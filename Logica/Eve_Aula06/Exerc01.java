package br.com.fiap.listaI;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exerc01 {

	public static double calcEstadia(int tipo, int qtdDiarias) {
		if (tipo == 1) {
			return qtdDiarias * 380;
		} else if (tipo == 2) {
			return qtdDiarias * 450;
		} else {
			return qtdDiarias * 560;
		}
	}

	public static double calcForma(String tipoPgto, double subTotal) {
		if (tipoPgto.toLowerCase().charAt(0) == 'v') {
			return subTotal -= subTotal * 0.1;
		} else {
			return subTotal;
		}
	}

	public static void main(String[] args) {

		String nome = null, tipoPgto = null;
		int tipo = 0, qtdDiarias = 0;

		try (Scanner t = new Scanner(System.in)) {

			System.out.print("Digite o nome do hospede: ");
			nome = new String(t.nextLine());

			do {
				System.out.print("Digite o tipo de acomodação 1- Standard, 2- Luxo e 3- Super Luxo: ");
				tipo = t.nextInt();
			} while (tipo <= 0 || tipo > 3);
			System.out.print("Digite a quantidade de diarias: ");
			qtdDiarias = t.nextInt();

			double subTotal = calcEstadia(tipo, qtdDiarias);

			System.out.println("Forma de pagamento (V) à vista, (P) a prazo: ");
			tipoPgto = t.next();

			double total = calcForma(tipoPgto, subTotal);

			NumberFormat n = NumberFormat.getCurrencyInstance();
			System.out.println(" ------ Pousada Beira Mar ------ ");
			System.out.println("Hospede: " + nome);
			System.out.println("Quantidade de diarias: " + qtdDiarias + " (Tipo:" + tipo + ")");
			System.out.println("-------------------------------- ");
			System.out.println("Sub-Total: " + n.format(subTotal));
			System.out.println("-------------------------------- ");
			System.out.println("Tipo de pagamento: " + tipoPgto);
			System.out.println("Total: " + n.format(total));

		} catch (Exception e) {
			System.out.println("Erro:" + e);
			e.printStackTrace();
		}

	}

}
