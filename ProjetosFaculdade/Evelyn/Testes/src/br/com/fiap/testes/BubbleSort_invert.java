package br.com.fiap.testes;

import java.util.Arrays;

public class BubbleSort_invert {

	public static boolean troca(int[] lista, int pA, int pB) {		
		int aux = lista[pA];
		lista[pA] = lista[pB];
		lista[pB] = aux;
		//System.out.println("Trocou " + lista[pA] + " pelo " + lista[pB] + " - Vetor:" + Arrays.toString(lista));
		return false;
	}

	public static void main(String[] args) {

		int[] n = {3, 2, 1, 32, 8, 4, 9, 11}; // 
		boolean t = false;
		
		//System.out.println("Vetor inicial: " + Arrays.toString(n));
		for (int i = 0; i < n.length && !t; i++) {
			t = true;
			//System.out.println("Loop principal n�mero " + i + " - Vetor: " + Arrays.toString(n));
			for (int j = n.length - 1; j > i; j--) {
				//System.out.println("Loop secund�rio na casa: " + j + " - Vetor: " + Arrays.toString(n));
				t = (n[j] < n[j - 1]) ? troca(n, j, j - 1) : true;				
			}
		}
		
		//System.out.println("Terminou:" + t);
		
		System.out.print(Arrays.toString(n));

	}

}
