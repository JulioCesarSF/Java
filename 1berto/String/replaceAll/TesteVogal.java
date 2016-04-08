package br.descando.teste;

import br.descanso.modelo.*;

public class TesteVogal {

	public static void main(String[] args) {
		Vogal v = new Vogal("Isto é um texto com todas a vogais.");
		
		System.out.println(v.trocarLetras());
		
		v.setPalavra("cadeira");
		
		System.out.println(v.trocarLetras());

	}

}
