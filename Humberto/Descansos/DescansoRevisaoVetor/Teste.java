package br.com.fiap.Testes;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

import br.com.fiap.Beans.Acessorio;
import br.com.fiap.Beans.Veiculo;
import br.com.fiap.Excecoes.Excecoes;

public class Teste {

	public static String p(String t) {
		return JOptionPane.showInputDialog(t);
	}

	public static Veiculo[] copiaVeiculo(Veiculo[] de, int tamanho) {
		Veiculo[] vV = new Veiculo[tamanho];
		for (int i = 0; i < tamanho; i++)
			if (de[i] != null)
				vV[i] = de[i];
		return vV;
	}

	public static double valorTotal(Veiculo[] v) {
		double total = 0d;
		for (int i = 0; i < v.length; i++)
			total += v[i].getValor();
		return total;
	}

	public static double mediaVeiculo(Veiculo[] v) {
		double media = 0d;
		for (int i = 0; i < v.length; i++)
			media += v[i].getValor();
		return media /= v.length;
	}

	public static String maisCaro(Veiculo[] v) {
		double valor = 0d;
		int in = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i].getValor() > valor) {
				valor = v[i].getValor();
				in = i;
			}
		}
		return v[in].getTudo();
	}

	public static void totalAc(Veiculo[] v) {
		for (int i = 0; i < v.length; i++)
			System.out.println("Modelo:\t" + v[i].getModelo() + "\tTotal Acessórios:\t" + v[i].totalAcessorios());
	}

	public static void main(String[] args) throws Excecoes {

		Veiculo[] v = new Veiculo[5];
		Acessorio[] ac = new Acessorio[3];
		int max = 0;
		int max2 = 0;

		try {

			while (JOptionPane.showConfirmDialog(null, "Cadastrar Veículo?", "Veículo", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE) == 0 && max < 5) {

				v[max] = new Veiculo(p("Modelo"), p("Montadora"), Integer.parseInt(p("Ano")),
						Double.parseDouble(p("Valor")));

				max2 = 0; // reset acessorios

				while (JOptionPane.showConfirmDialog(null, "Cadastrar Acessório?", "Acessório",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0 && max2 < 3) {

					ac[max2] = new Acessorio(p("Descrição"), Double.parseDouble(p("Valor")));
					max2++;
				}

				Acessorio[] vA = new Acessorio[max2];

				v[max].setAcessorios(vA);

				max++;

			}

			Veiculo[] vV = copiaVeiculo(v, max);

			NumberFormat nb = NumberFormat.getCurrencyInstance();
			if (max > 0) {
				System.out.println("Valor total todos os veiculos: " + nb.format(valorTotal(vV)));
				System.out.println("Média de todos os veículos: " + nb.format(mediaVeiculo(vV)));
				System.out.println("Veiculo mais caro: " + maisCaro(vV));
				System.out.println("Total de acessórios de cada veículo:");
				totalAc(vV);
			}
		} catch (Exception e) {
			throw new Excecoes("Erro", e);
		} finally {
			System.out.println("Fim da execução!");
		}
	}

}
