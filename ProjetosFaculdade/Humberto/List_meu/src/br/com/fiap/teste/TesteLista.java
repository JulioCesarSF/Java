package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class TesteLista {

	public static void main(String[] args) {
		ArrayList<String> cargos = new ArrayList<String>();

		cargos.add("DBA");
		cargos.add("Analista");
		cargos.add("Desenvolvedor");
		System.out.println(cargos);
		Collections.sort(cargos);
		System.out.println(cargos);

		for (int i = 0; i < 2; i++) {
			System.out.println(cargos.get(i).toUpperCase());
		}
		
		String cargo = new String(JOptionPane.showInputDialog("O que deseja pesquisar?"));
		
		if(cargos.indexOf(cargo) >= 0){
			System.out.println("Existe");
		}else{
			System.out.println("Não Existe");
		}

	}

}
