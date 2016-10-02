import java.util.StringJoiner;

public class Exerc07 {

	public static void main(String[] args) {
		int[] vetorA = { 2, 1, 5, 12, 8, 38, 36, 0 };

		printVetor(ordenaCrescente(vetorA));
	}

	public static void printVetor(int[] vetorA) {
		StringJoiner vetor = new StringJoiner(",", "", "");
		for (int n : vetorA) {
			vetor.add(String.valueOf(n));
		}

		System.out.println(vetor + " (" + vetorA.length + ")");
	}

	private static int[] ordenaCrescente(int[] vetorA) {
		for (int i = 0; i < vetorA.length; i++) {
			for (int k = i; k < vetorA.length; k++) {
				if (vetorA[i] > vetorA[k]) {
					int t = vetorA[i];
					vetorA[i] = vetorA[k];
					vetorA[k] = t;
				}
			}
		}
		return vetorA;
	}

}
