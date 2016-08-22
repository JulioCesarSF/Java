package br.com.fiap.testes;

import java.util.Arrays;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;

public class TesteAluno {

	public static double medias(Aluno[] alunos, int ind) {
		double total = 0;
		for (int i = 0; i < ind; i++) {
			total += alunos[i].getMedia();
		}
		total /= ind;
		return total;
	}

	public static int faltas(Aluno[] alunos, int ind) {
		int total = 0;
		for (int i = 0; i < ind; i++) {
			total += alunos[i].getFaltas();
		}
		return total;
	}

	public static int mediaIdade(Aluno[] alunos, int ind) {
		int media = 0;
		for (int i = 0; i < ind; i++) {
			media += alunos[i].getIdade();
		}
		media /= ind;
		return media;
	}

	public static String maisVelho(Aluno[] alunos, int ind) {
		int tmp = 0;
		String nome = new String();
		for (int i = 0; i < ind; i++) {
			if (alunos[i].getIdade() >= tmp) {
				tmp = alunos[i].getIdade();
				nome = alunos[i].getNome();
			}
		}
		return "O aluno mais velho é o(a) " + nome + " com " + tmp + " ano(s)!";

	}

	public static String maisNovo(Aluno[] alunos, int ind) {
		int tmp = (int) 1e9;
		String nome = new String();
		for (int i = 0; i < ind; i++) {
			if (alunos[i].getIdade() <= tmp) {
				tmp = alunos[i].getIdade();
				nome = alunos[i].getNome();
			}
		}
		return "O aluno mais novo é o(a) " + nome + " com " + tmp + " ano(s)!";
	}

	public static void main(String[] args) {
		int resp = 0, intFaltas = 0, intIdade = 0, indice = 0;

		double dblMedia = 0;
		String strNome = null;
		Aluno[] obj = new Aluno[10];

		while (resp == 0 && indice < 10) {

			try {
				strNome = JOptionPane.showInputDialog("Digite o nome do aluno");
				dblMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a média"));
				intFaltas = Integer.parseInt(JOptionPane.showInputDialog("Digite as faltas"));
				intIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
				obj[indice] = new Aluno(strNome, dblMedia, intFaltas, intIdade);
				indice++;

			} catch (Exception e) {
				System.out.println("Você digitou algo errado!");
			} finally {
				resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Camadas", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
			}

		}

		try {
			// média de notas
			System.out.println(
					Arrays.asList(obj).stream().map(Aluno::getMedia).reduce(0.0, (Double::sum)));
			
			System.out.println("Média " + medias(obj, indice));
			System.out.println("Total de faltas de todos os alunos " + faltas(obj, indice));
			System.out.println("Média de todas as idades dos alunos adicionados" + mediaIdade(obj, indice));
			System.out.println(maisVelho(obj, indice));
			System.out.println(maisNovo(obj, indice));

		} catch (Exception e) {
			System.out.println("Erro:\t:" + e);
		}

		/*
		 * for (int i = 0; i < indice; i++) { System.out.println("\nNome: " +
		 * obj[i].getNome() + "\n Média: " + obj[i].getMedia()); }
		 */

	}

}
