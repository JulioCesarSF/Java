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
	/* 1. Retornar o total de funcionários cadastrados */
	public static int totalFuncionarios(List<?> f) {
		return f.size();
	}

	/* 2. Retornar a média geral dos salários */
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

	/* 4. Imprimir os nomes de todos os funcionários */
	public static String imprimirTodos(List<Funcionario> f) {
		StringBuilder nomes = new StringBuilder();
		for (Funcionario ff : f)
			nomes.append(ff.getNome() + "\n");
		return nomes.toString();
	}

	/*
	 * 5. Imprimir os nomes e salários de todos os fucnionários em odem
	 * crescente de salário
	 */
	public static String imprimirNomesSalarioCrescente(List<Funcionario> f) {
		NumberFormat n = NumberFormat.getCurrencyInstance();
		StringBuilder lista = new StringBuilder();

		Collections.sort(f); // implements Comparable<Funcionario>, Override
								// método compareTo

		for (Funcionario ff : f)
			lista.append("\nNome:\t" + ff.getNome() + "\tSalário:\t" + n.format(ff.getSalario()));
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

	/* 7. Excluir os funcionários que ganham mais de R$ 6.000,00 */
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
		System.out.println("1. Total de funcionários cadastrados:\t" + totalFuncionarios(f));
		System.out.println("2. Média geral dos salários:\t" + mediaSalario(f));
		System.out.println("3. Total da folha de pagamento:\t" + totalFolha(f));
		System.out.println("4. Nomes de todos os funcionários:\n" + imprimirTodos(f));
		System.out.println("5. Nomes e salários em ordem crescente:\n" + imprimirNomesSalarioCrescente(f));
		System.out.println("6. Nomes e os cargos em ordem crescente com mais de 3 faltas:\t"
				+ imprimirNomesCargosCrescenteFaltas(f));
		System.out.println("7. Funcionários que não ganham mais de R$6.000,00:\n" + excluirMais6k(f));

		// deletar
		delMais6k(f);
		System.out.println("Funcionário que ganham mais de R$ 6.000,00 deletados!");
		if (f.size() > 0)
			for (Funcionario ff : f)
				System.out.println(ff.getTudo());
	}

	public static void main(String[] args) throws Excecoes {

		Helper h = new Helper(); // static inner class

		List<Funcionario> f = new ArrayList<>();

		try {

			Funcionario ff = null;

			while (h.aA("Cadastrar NOVO funcionário?", "Novo funcionário") != 1) {

				ff = new Funcionario(h.a("Nome?"), h.a("Cargo"), Double.parseDouble(h.a("Salário?")),
						Integer.parseInt(h.a("Faltas?")));

				f.add(ff);
			}

			enunciados(f);

		} catch (Exception e) {
			throw new Excecoes("-> Erro", e);
		} finally {
			System.out.println("Fim da Execução.");
		}

	}

	public static class Helper {
		public String a(String q) {
			return JOptionPane.showInputDialog(q);
		}

		public int aA(String q, String t) {
			return JOptionPane.showConfirmDialog(null, q, t, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
	}

}
