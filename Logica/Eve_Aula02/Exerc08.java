package br.com.fiap.exercs;

import java.util.Arrays;

public class Exerc08 {

	public static void main(String[] args) {
		int[] v1 = { 3, 5, 4, 2, 2, 5, 3, 2, 5, 9 };
		int[] v2 = { 7, 15, 20, 0, 18, 4, 55, 23, 8, 6 };
		int[] v3 = new int[20];

		for (int i = 0; i < v3.length; i++) {
			v3[i] = ((i % 2) == 0) ? v1[i/2] : v2[i/2];

			/*if ((i % 2) == 0)
				v3[i] = v1[i / 2];
			else
				v3[i] = v2[i / 2];*/
		}

		System.out.println(Arrays.toString(v3));

	}

}
