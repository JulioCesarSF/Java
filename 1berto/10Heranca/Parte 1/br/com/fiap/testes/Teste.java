package br.com.fiap.testes;

import br.com.fiap.Beans.CompactDisc;
import br.com.fiap.Beans.Livro;

public class Teste {

	public static void main(String[] args) {
		Livro livro = new Livro(1, 55, "Aprenda Java", "0-1010-2", "Braufag�lio");
		
		System.out.println("C�digo:" + livro.getCodigo());
		System.out.println("Descri��o:"+ livro.getDescricao());
		System.out.println("Pre�o:"+ livro.getValor());
		System.out.println("Autor:"+ livro.getAutor());
		System.out.println("ISBN:"+ livro.getIsbnNumeros());
		
		System.out.println("");
		CompactDisc cd = new CompactDisc(2, 60, "CD de M�sica", "Sony Music", "J�lio");
		
		System.out.println("C�digo:" + cd.getCodigo());
		System.out.println("Descri��o:" + cd.getDescricao());
		System.out.println("Pre�o:" + cd.getValor());
		System.out.println("Artista:" + cd.getArtista());
		System.out.println("Gravadora:" + cd.getGravadora());

	}

}
