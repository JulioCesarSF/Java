package br.com.fiap.testes;

import java.util.StringJoiner;

public class BubbleSort {

	public static void main(String[] args) {

		int[] n = { 5, 3, 4, 2, 1, 99, 31, 45, 78, 12, 13 };

		Bubble.ordena(n, true);

		System.out.println(Bubble.asList(n));

	}

	public static class Bubble {

		public static void ordena(int[] l, boolean crescente) {
			boolean trocar = true;
			do {
				trocar = false;
				for (int i = 0; i < l.length - 1; i++)
					if (crescente) {
						if (l[i] > l[i + 1])
							trocar = troca(l, i, i + 1);
					} else {
						if (l[i] < l[i + 1])
							trocar = troca(l, i, i + 1);
					}
			} while (trocar);
		}

		private static boolean troca(int[] l, int a, int b) {
			int aux = l[a];
			l[a] = l[b];
			l[b] = aux;
			return true;
		}

		public static String asList(int[] l) {
			StringJoiner j = new StringJoiner(", ", "[", "]");
			for (int i : l)
				j.add("" + i);
			return j.toString();
		}

	}

}
