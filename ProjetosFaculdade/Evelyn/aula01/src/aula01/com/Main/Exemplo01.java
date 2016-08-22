package aula01.com.Main;

import java.util.Scanner;

//vetores

public class Exemplo01 {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		String[] nomes = new String[5];

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Digite o nome " + i + ":");
			nomes[i] = t.next();
			System.out.println(nomes[i] + " adicionado!");
		}

		for (int i = 0; i < nomes.length; i++)
			System.out.println("Nome: " + nomes[i] + " (" + i + ")");

		t.close();

	}

}
