package br.descando.teste;

import br.descanso.modelo.*;

public class TesteMaisculo {

	public static void main(String[] args) {
		Maiuscula m = new Maiuscula("teste");
		
		System.out.println(m.palavraM().concat("\tagora está em maiúsculo!"));

	}

}
