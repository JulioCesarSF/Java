package aula01.com.Main;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		String[] nome = new String[3];
		float[] temp = new float[3];

		for (int i = 0; i < 3; i++) {

			System.out.println("Digite o nome:");
			nome[i] = t.next();

			System.out.println("Digite a temperatura:");
			temp[i] = t.nextFloat();
		}

		float tmp = 0;
		String n = new String();	

		for (int i = 0; i < 3; i++) {
			if (temp[i] > 37f) { // && temp[i] >= tmp
				tmp = temp[i];
				n = nome[i];
				System.out.println(n + " está com febre, temperatura: " + tmp);
			}
		}

		t.close();

	}

}
