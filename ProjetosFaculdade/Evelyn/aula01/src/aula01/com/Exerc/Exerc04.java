package aula01.com.Exerc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exerc04 {

	public static void p(String t) {
		System.out.println(t);
	}

	public static void main(String[] args) {

		float temps[] = new float[12];
		String mes[] = { "Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };

		float maior = 0f;
		float menor = 1e9f;
		String mesMaior = new String();
		String mesMenor = new String();

		try (Scanner t = new Scanner(System.in)) {

			for (int i = 0; i < temps.length; i++) {
				p("Informe a temperatura do m�s de " + mes[i] + ":");
				temps[i] = t.nextFloat();				

				if (temps[i] > maior) {
					maior = temps[i];
					mesMaior = mes[i];
				}

				if (temps[i] < menor) {
					menor = temps[i];
					mesMenor = mes[i];
				}
			}

			p("Maior temperatura " + maior + " graus ocorrida em: " + mesMaior);
			p("Menor temperatura " + menor + " graus ocorrida em: " + mesMenor);

		} catch (InputMismatchException e) {
			System.out.println("Voc� digitou algo errado! Reinicie o aplicativo.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Lista fora dos limites! Reinicie o aplicativo.");
		} catch (Exception e) {
			System.out.println("Erro inesperado: " + e);
		} finally {
			System.out.println("Fim da execu��o.");
		}

	}

}
