package aula01.com.Main;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		double[] n = new double[10];

		double soma = 0;

		for (int i = 0; i < n.length; i++) {
			System.out.println("Digite um n�mero:");
			n[i] = t.nextDouble();
			soma += n[i];
		}

		System.out.println("M�dia: " + soma / n.length);

		t.close();

	}

}
