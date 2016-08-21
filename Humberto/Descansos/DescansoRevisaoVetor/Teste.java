package br.com.fiap.teste;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Acessorio;
import br.com.fiap.beans.Veiculo;
import br.com.fiap.excecoes.Excecao;

public class Teste {

	/* a-) Valor total dos veículos cadastrados */
	public static double valorTotal(Veiculo[] v) {
		double soma = 0d;
		for (Veiculo a : v)
			soma += a.getValor();
		return soma;
	}

	public static String valorTotalS(Veiculo[] v) {
		double soma = 0d;
		for (Veiculo a : v)
			soma += a.getValor();
		NumberFormat n = NumberFormat.getCurrencyInstance();
		return n.format(soma);
	}

	/* b-) Média todos os veículos */
	public static double mediaValores(Veiculo[] v) {
		double media = 0d;
		for (Veiculo a : v)
			media += a.getValor();
		return media /= v.length;
	}

	public static String mediaValoresS(Veiculo[] v) {
		double media = 0d;
		for (Veiculo a : v)
			media += a.getValor();
		NumberFormat n = NumberFormat.getCurrencyInstance();
		return n.format(media /= v.length);
	}

	/* c-) Veículo mais caro */
	public static String maisCaro(Veiculo[] v) {
		double d = 0;
		String n = new String();
		for (Veiculo a : v)
			if (a.getValor() > d) {
				d = a.getValor();
				n = a.getTudo();
			}

		return n;
	}

	/*
	 * d-) Total de acessórios de cada veículo, enunciado não fala se total é
	 * quantidade ou de valores
	 */
	public static String totalAcessorios(Veiculo[] v) {
		StringBuilder r = new StringBuilder();

		for (Veiculo a : v)
			r.append("\n" + a.getTudo() + " Total Acessório:\t" + a.getAcessorios().length);

		return r.toString().toUpperCase();
	}
	
	public static String totalAcessoriosD(Veiculo[] v){
		StringBuilder r = new StringBuilder();
		NumberFormat n = NumberFormat.getCurrencyInstance();	
		
		for(Veiculo a : v){
			double s = 0d;
			
			for(Acessorio b : a.getAcessorios())
				s+=b.getValor();
			
			r.append("\n" + a.getTudo() + "\tTotal Acessório:\t" + a.getAcessorios().length + "\t" + n.format(s));
		}
		
		return r.toString().toUpperCase();
	}

	public static void enunciados(Veiculo[] v) {
		System.out.println("a-) " + valorTotalS(v));
		System.out.println("b-) " + mediaValoresS(v));
		System.out.println("c-) " + maisCaro(v));
		System.out.println("d-) " + totalAcessorios(v));
	}

	public static void main(String[] args) throws Excecao {

		Veiculo[] v = new Veiculo[5];
		Acessorio[] a = new Acessorio[3];
		int maxV = -1, maxA = -1; // index
		try {

			while (Helper.q("Cadastrar novo veículo?", "Cadastro de Veículo") != 1 && maxV <= 4) {

				maxV++;

				Veiculo o = new Veiculo(Short.parseShort(Helper.a("Ano do veículo?")), Helper.a("Modelo do veículo?"),
						Helper.a("Montadora do veículo?"), Double.parseDouble(Helper.a("Valor do veículo?")));

				while (Helper.q("Cadastrar novo Acessório?", "Cadastro de acessório") != 1 && maxA <= 2) {

					maxA++;

					Acessorio o1 = new Acessorio(Helper.a("Descrição do acessório:"),
							Double.parseDouble(Helper.a("Valor do Acessórios?")));

					a[maxA] = o1;

				}
				maxA++; // ajustar para tamanho do array
				o.setAcessorios(Helper.copiar(a, maxA));
				maxA = -1; // reajustar index para o próximo veículo

				v[maxV] = o;
			}

			maxV++; // ajustar para tamanho do array
			Veiculo[] n = Helper.copiar(v, maxV);

			if (maxV > 0)
				enunciados(n);

		} catch (Exception e) {
			throw new Excecao("Erro!!!", e, true);
		} finally {
			System.out.println("Fim da execução!");
		}

	}

	public static class Helper {

		public static String a(String q) {
			return JOptionPane.showInputDialog(q);
		}

		public static int q(String msg, String caption) {
			return JOptionPane.showConfirmDialog(null, msg, caption, JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
		}

		public static <T> T[] copiar(T[] original, int tamanho) {
			Class<?> tipo = original.getClass().getComponentType();

			@SuppressWarnings("unchecked")
			T[] copia = (T[]) java.lang.reflect.Array.newInstance(tipo, tamanho);

			for (int i = 0; i < tamanho; i++)
				if (original[i] != null)
					copia[i] = original[i];

			return copia;
		}

	}

}
