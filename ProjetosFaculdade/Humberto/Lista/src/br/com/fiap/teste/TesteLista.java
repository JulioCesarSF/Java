package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class TesteLista {

	public static String p(String t) {
		return new String(JOptionPane.showInputDialog(t));
	}

	public static void main(String[] args) {
		List<String> cargos = new ArrayList<>();

		while (JOptionPane.showConfirmDialog(null, "Deseja Cadastrar um Cargo?", "Cargos",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) != 1) {

			cargos.add(p("Digite um cargo:"));

		}		

		String cargo = p("O que deseja pesquisa?:");

		System.out.println((cargos.indexOf(cargo) != -1) ? "Existe" : "Nao Existe");

		Collections.sort(cargos);
		System.out.println(cargos);

	}

}
