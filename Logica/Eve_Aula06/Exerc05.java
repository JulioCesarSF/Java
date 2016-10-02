import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {

		char[] sexo = new char[5];
		char[] olho = new char[5];
		char[] cabelo = new char[5];
		int[] idade = new int[5];

		try (Scanner t = new Scanner(System.in)) {

			for (int i = 0; i < sexo.length; i++) {

				System.out.println("Habitante " + (i + 1) + ":");
				
				System.out.print("Sexo:");
				do {
					String linha = t.next() + t.nextLine();
					sexo[i] = linha.toLowerCase().charAt(0);
				} while (!validarSexo(String.valueOf(sexo[i])));

				System.out.print("Olho:");
				do {
					olho[i] = t.nextLine().toLowerCase().charAt(0);
				} while (!validarOlhos(olho[i]));

				System.out.print("Cabelo:");
				do {
					cabelo[i] = t.nextLine().toLowerCase().charAt(0);
				} while (!validarCabelo(cabelo[i]));

				System.out.print("Idade:");
				do {
					idade[i] = t.nextInt();
				} while (!validarIdade(idade[i]));
				
				System.out.println("");

			}

			System.out.println(
					"Média de idade das pessoas com olhos castanhos e cabelos pretos " + media(olho, cabelo, idade));

			System.out.println("Maior idade entre os habitantes: " + maior(idade));

			System.out.println(
					"Sexo feminino com idade entre 18 e 35 anos (inclusive) e que tenham olhos azuis e cabelos louros: "
							+ qtd(idade, olho, cabelo));

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

	public static int qtd(int[] idade, char[] olho, char[] cabelo) {
		int qt = 0;
		for (int i = 0; i < idade.length; i++) {
			if (idade[i] >= 18 && idade[i] <= 35 && olho[i] == 'a' && cabelo[i] == 'l')
				qt++;
		}
		return qt;
	}

	public static int maior(int[] idade) {
		int maior = Integer.MIN_VALUE;
		for (int i = 0; i < idade.length; i++) {
			if (idade[i] > maior)
				maior = idade[i];
		}
		return maior;
	}

	private static double media(char[] olho, char[] cabelo, int[] idade) {
		double media = 0d;
		int t = 0;
		for (int i = 0; i < idade.length; i++) {
			if (cabelo[i] == 'p' && olho[i] == 'c') {
				media += idade[i];
				t++;
			}
		}
		return (media / t);
	}

	public static boolean validarSexo(String s) {
		if (s.equals("m") || s.equals("f"))
			return true;
		return false;
	}

	public static boolean validarOlhos(char s) {
		if (s == 'a' || s == 'c')
			return true;
		return false;
	}

	public static boolean validarCabelo(char s) {
		if (s == 'l' || s == 'c' || s == 'p')
			return true;
		return false;
	}

	public static boolean validarIdade(int i) {
		if (i > 0)
			return true;
		return false;
	}

}
