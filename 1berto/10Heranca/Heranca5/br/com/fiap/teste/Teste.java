package br.com.fiap.teste;

import br.com.fiap.beans.Polo;

public class Teste {	

	public static void main(String[] args) {
		Polo p = new Polo("Time Azul", "Azul claro", 4, 8, 8);
		
		System.out.println(p.exibirTudo());

	}

}
