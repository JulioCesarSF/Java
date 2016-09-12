package br.com.fiap.listaI;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exerc03 {

	public static double preco(int codigo, double carga) {
		if (codigo <= 10) {
			return (carga * 1000) * 120;
		} else if (codigo <= 20) {
			return (carga * 1000) * 200;
		} else
			return (carga * 1000) * 280;
	}

	public static void imposto(double valorCarga) {
		NumberFormat n = NumberFormat.getCurrencyInstance();
		double f = valorCarga * 0.25;
		System.out.println("Código do Estado 1: " + n.format(valorCarga) + " Imposto " + n.format(f) + " Total:"
				+ n.format(valorCarga + f));
		f = valorCarga * 0.20;
		System.out.println("Código do Estado 2: " + n.format(valorCarga) + " Imposto " + n.format(f) + " Total:"
				+ n.format(valorCarga + f));
		f = valorCarga * 0.15;
		System.out.println("Código do Estado 3: " + n.format(valorCarga) + " Imposto " + n.format(f) + " Total:"
				+ n.format(valorCarga + f));
		System.out.println("Código do Estado 4: ISENTO");
	}

	public static void main(String[] args) {
		int codigo = 0;
		double carga = 0d;

		try (Scanner t = new Scanner(System.in)) {
			do {
				System.out.print("Código do caminhão");
				codigo = t.nextInt();
			} while (codigo <= 0 || codigo > 30);

			do {
				System.out.print("Carga em toneladas do caminhão:");
				carga = t.nextDouble();
			} while (carga < 0);

			imposto(preco(codigo, carga));

		} catch (Exception e) {
			System.out.println("Erro:" + e);
			e.printStackTrace();
		}
	}

}
