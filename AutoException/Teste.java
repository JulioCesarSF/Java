package br.com.fiap.teste;

import br.com.fiap.excecao.Excecao;

public class Teste {
	
	public static void main(String[] args) throws Exception {
		
		try{
			int d = 10/0;
		}catch(Exception e){
			throw new Excecao(e);
		}
		
	}

}
