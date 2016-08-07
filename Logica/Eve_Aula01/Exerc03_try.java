import java.util.InputMismatchException;
import java.util.Scanner;

public class Exerc03_try {

	public static void p(String t) {
		System.out.println(t);
	}

	public static void main(String[] args) {

		String nomes[] = new String[10];

		try (Scanner t = new Scanner(System.in)) {

			for (int i = 0; i < nomes.length; i++) {
				p("Digite o " + (i + 1) + " nome:");
				nomes[i] = new String(t.nextLine());
			}

			p("Qual nome você gostaria de buscar?");
			String achar = new String(t.nextLine());

			for (String nome : nomes) {
				if (nome.equalsIgnoreCase(achar))
					p("Achei");
			}

		} catch (InputMismatchException e) {
			System.out.println("Você digitou algo errado! Reinicie o aplicativo.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Lista fora dos limites! Reinicie o aplicativo.");
		} catch (Exception e) {
			System.out.println("Erro inesperado: " + e);
		} finally {
			System.out.println("Fim da execução.");
		}

	}

}
