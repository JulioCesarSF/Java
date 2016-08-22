package aula01.com.Exerc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exerc01 {

	public static void p(String texto) {
		System.out.println(texto);
	}

	public static void main(String[] args) {

		float temp[] = new float[7];
		float media = 0f;
		int dias = 0;

		try (Scanner t = new Scanner(System.in)) {

			for (int i = 0; i < temp.length; i++) {
				p("Digite uma temperatura do " + (i + 1) + " dia:");
				temp[i] = t.nextFloat();
				media += temp[i];
			}

			media /= temp.length;

			for (float tmp : temp) {
				if (tmp > media)
					dias++;
			}

			p("A média da temperatura na semana foi: " + media);
			p("A quantidade de dia(s) com temperatura acima da média: " + dias);

		} catch (InputMismatchException e) {
			System.out.println("Você digitou algo errado! Reinicie o aplicativo.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Lista fora dos limites! Reinicie o aplicativo.");
		} catch (Exception e) {
			System.out.println("Erro inesperado: " + e);
		}finally {
			System.out.println("Fim da execução.");
		}

	}

}
