package br.com.fiap.testes;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Funcionario;
import br.com.fiap.excecoes.Excecoes;

public class Teste {
	/* 1. Retornar o total de funcion�rios cadastrados */
	public static int totalFuncionarios(List<?> f) {
		return f.size();
	}

	/* 2. Retornar a m�dia geral dos sal�rios */
	public static String mediaSalario(List<Funcionario> f) {
		NumberFormat n = NumberFormat.getCurrencyInstance();
		double media = 0d;
		for (Funcionario ff : f)
			media += ff.getSalario();
		return n.format(media /= f.size());
	}

	public static double mediaSalarioDouble(List<Funcionario> f) {
		double media = 0d;
		for (Funcionario ff : f)
			media += ff.getSalario();
		return media /= f.size();
	}

	/* 3. Retornar o total da folha de pagamento */
	public static String totalFolha(List<Funcionario> f) {
		NumberFormat n = NumberFormat.getCurrencyInstance();
		double total = 0d;
		for (Funcionario ff : f)
			total += ff.getSalario();
		return n.format(total);
	}

	public static double totalFolhaDouble(List<Funcionario> f) {
		double total = 0d;
		for (Funcionario ff : f)
			total += ff.getSalario();
		return total;
	}

	/* 4. Imprimir os nomes de todos os funcion�rios */
	public static String imprimirTodos(List<Funcionario> f) {
		StringBuilder nomes = new StringBuilder();
		for (Funcionario ff : f)
			nomes.append(ff.getNome() + "\n");
		return nomes.toString();
	}

	/*
	 * 5. Imprimir os nomes e sal�rios de todos os fucnion�rios em odem
	 * crescente de sal�rio
	 */
	public static String imprimirNomesSalarioCrescente(List<Funcionario> f) {
		NumberFormat n = NumberFormat.getCurrencyInstance();
		StringBuilder lista = new StringBuilder();

		Collections.sort(f); // implements Comparable<Funcionario>, Override
								// m�todo compareTo

		for (Funcionario ff : f)
			lista.append("\nNome:\t" + ff.getNome() + "\tSal�rio:\t" + n.format(ff.getSalario()));
		return lista.toString();
	}

	/* 6. Imprimir os nomes/cargos crescente, > 3 faltas */
	public static String imprimirNomesCargosCrescenteFaltas(List<Funcionario> f) {
		StringBuilder lista = new StringBuilder();

		Collections.sort(f, new Comparator<Funcionario>() {

			@Override
			public int compare(Funcionario o1, Funcionario o2) {
				return o1.getCargo().compareTo(o2.getCargo());
			}
		});

		for (Funcionario ff : f)
			if (ff.getFaltas() > 3)
				lista.append("\nNome:\t" + ff.getNome() + "\tCargo:\t" + ff.getCargo());
		
		if (lista.equals(""))
			lista.append("NENHUM");
		
		return lista.toString();
	}

	/* 7. Excluir os funcion�rios que ganham mais de R$ 6.000,00 */
	public static String excluirMais6k(List<Funcionario> f) {
		StringBuilder lista = new StringBuilder();

		for (Funcionario ff : f)
			if (ff.getSalario() <= 6000d)
				lista.append(ff.getTudo() + "\n");
		
		return lista.toString();
	}

	public static void delMais6k(List<Funcionario> f) {
		for (Funcionario ff : f)
			if (ff.getSalario() > 6000d){				
				f.remove(ff);
			}
	}

	public static void enunciados(List<Funcionario> f) {
		System.out.println("1. Total de funcion�rios cadastrados:\t" + totalFuncionarios(f));
		System.out.println("2. M�dia geral dos sal�rios:\t" + mediaSalario(f));
		System.out.println("3. Total da folha de pagamento:\t" + totalFolha(f));
		System.out.println("4. Nomes de todos os funcion�rios:\n" + imprimirTodos(f));
		System.out.println("5. Nomes e sal�rios em ordem crescente:\n" + imprimirNomesSalarioCrescente(f));
		System.out.println("6. Nomes e os cargos em ordem crescente com mais de 3 faltas:\t"
				+ imprimirNomesCargosCrescenteFaltas(f));
		System.out.println("7. Funcion�rios que n�o ganham mais de R$6.000,00:\n" + excluirMais6k(f));

		// deletar
		delMais6k(f);
		System.out.println("Funcion�rio que ganham mais de R$ 6.000,00 deletados!");
		if (f.size() > 0)
			for (Funcionario ff : f)
				System.out.println(ff.getTudo());
	}

	public static void main(String[] args) throws Excecoes {	

		List<Funcionario> f = new ArrayList<>();

		try {			

			while (Helper.aA("Cadastrar NOVO funcion�rio?", "Novo funcion�rio") != 1) {				

				f.add(new Funcionario(Helper.a("Nome?"), Helper.a("Cargo"), Double.parseDouble(Helper.a("Sal�rio?")),
						Integer.parseInt(Helper.a("Faltas?"))));
			}

			enunciados(f);

		} catch (Exception e) {
			throw new Excecoes("-> Erro", e);
		} finally {
			System.out.println("Fim da Execu��o.");
		}

	}

	public static class Helper {
		public static String a(String q) {
			return JOptionPane.showInputDialog(q);
		}

		public static int aA(String q, String t) {
			return JOptionPane.showConfirmDialog(null, q, t, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
	}

}
