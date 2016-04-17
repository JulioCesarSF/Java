package br.com.fiap.testes;

import br.com.fiap.Beans.CompactDisc;
import br.com.fiap.Beans.Livro;

public class Teste {

	public static void main(String[] args) {
		Livro livro = new Livro(1, 55, "Aprenda Java", "0-1010-2", "Braufagélio");
		
		System.out.println("Código:" + livro.getCodigo());
		System.out.println("Descrição:"+ livro.getDescricao());
		System.out.println("Preço:"+ livro.getValor());
		System.out.println("Autor:"+ livro.getAutor());
		System.out.println("ISBN:"+ livro.getIsbnNumeros());
		
		System.out.println("");
		CompactDisc cd = new CompactDisc(2, 60, "CD de Música", "Sony Music", "Júlio");
		
		System.out.println("Código:" + cd.getCodigo());
		System.out.println("Descrição:" + cd.getDescricao());
		System.out.println("Preço:" + cd.getValor());
		System.out.println("Artista:" + cd.getArtista());
		System.out.println("Gravadora:" + cd.getGravadora());

	}

}
