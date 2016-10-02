import java.text.NumberFormat;
import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		String[] nome = new String[4];
		double[] salario = new double[4];
		int[] tempo = new int[4];

		try (Scanner t = new Scanner(System.in)) {

			captar(nome, salario, tempo, t);

			relatorio(nome, salario, tempo);

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

	private static void relatorio(String[] nome, double[] salario, int[] tempo) {
		NumberFormat n = NumberFormat.getCurrencyInstance();
		for (int i = 0; i < nome.length; i++) {
			if (tempo[i] > 3 || salario[i] < 700) {
				System.out.println(nome[i] + n.format(salario[i]) + " TEM DIREITO");
			} else {
				System.out.println(nome[i] + n.format(salario[i]) + " NÃO TEM DIREITO");
			}
		}
	}

	private static void captar(String[] nome, double[] salario, int[] tempo, Scanner t) {
		for (int i = 0; i < nome.length; i++) {
			System.out.println("Funcionário (" + (i + 1) + ") :");
			System.out.print("Nome:");
			nome[i] = t.nextLine();
			System.out.print("Salário:");
			salario[i] = t.nextDouble();
			System.out.print("Tempo:");
			tempo[i] = t.nextInt();
			System.out.println("");
		}
	}

}
