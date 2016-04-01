package descansos.Test;

import descansos.Ebook.*;

public class Test {

	public static void main(String[] args) {

		/* ***************************  ebook *************************** */
		
		System.out.println("\n Exerc 03 - Pessoa Física \n");
		Fisica pFisica = new Fisica();
		pFisica.setNome("Julio César Schincariol Filho");
		pFisica.setEndereco("Rua Haddock Lobo");
		pFisica.setEmail("julio.com@uol.com.br");
		pFisica.setSexo("H");
		pFisica.setCpf(00000000000);
		pFisica.setRg(111111111);
		pFisica.setTelefone(30620214);
		System.out.println(pFisica.getAll());
		
		System.out.println("\n Exerc 03 - Pessoa Juridica \n");
		Juridica pJuridica = new Juridica();
		/*
		 * Contato pJContato = new Contato(); criar o objeto no construtor de "Juridica"
		 * pJuridica.setContato(pJContato);
		 * 
		 */
		
		pJuridica.setNome("Empresa nome Fantasia");
		pJuridica.setEndereco("Rua Fantasia");
		pJuridica.setEmail("juridica@fantasia.com.br");
		pJuridica.setCnpj(56465456);
		pJuridica.setIncricaoEstadual("219129812-231312/0001");
		
		pJuridica.setContatoNome("ContatoJuridicoNome");
		pJuridica.setContatoTelefone("18218902");
		
		System.out.println(pJuridica.getAll());
		
		System.out.println("\n Exerc 03 - Ebook1 \n");
		Ebook ebook1 = new Ebook();
		ebook1.setTitulo("Livro A");
		ebook1.setIsbn(1283813180);
		ebook1.setValor(152.99);
		ebook1.setAutorNome("Um Cara Muito Louco");
		ebook1.setAutorEmail("doidao@autor.com.br");
		ebook1.setAutorEndereco("Rua Autor");
		ebook1.setEditoraRazaoSocial("RazaoSocialEditora");
		ebook1.setEditoraEndereco("Rua da Editora");
		ebook1.setEditoraCnpj("82138712387");
		System.out.println(ebook1.getAll());
		
		Ebook ebook2 = new Ebook();
		ebook2.setTitulo("Livro B");
		ebook2.setValor(99.90);
		
		Carrinho carrinho = new Carrinho();
		carrinho.addEbook(ebook1, 20);
		carrinho.addEbook(ebook2, 5);
		carrinho.setTipoEntrega("Sedex");
		
		System.out.println("\n Exerc 03 - Venda (classe final) \n");
		
		Venda venda = new Venda();		
		venda.setCliente(pFisica);
		venda.setCarrinho(carrinho);
		venda.setFormaPgto("Dinheiro");
		venda.setCupomDesconto("Nenhum");
		
		System.out.println("\nVenda completa\n");
		
		carrinho.listEbooks();
		
		venda.calcTotal();
		
		System.out.println(venda.getAll());
		
		System.out.println("\nVenda sem ebook1\n");
		
		carrinho.delEbook(ebook1);
		
		carrinho.listEbooks();
		
		venda.calcTotal();
		
		System.out.println(venda.getAll());
		
		System.out.println("\nVenda sem ebook2 e com ebook1 de qntd diferente\n");
		
		carrinho.addEbook(ebook1, 10);
		carrinho.delEbook(ebook2);
		
		carrinho.listEbooks();
		
		venda.calcTotal();
		
		System.out.println(venda.getAll());
		
		System.out.println("\nVenda ebook1/2 atualizarQuantidade\n");		
		
		carrinho.addEbook(ebook2, 2);
		
		carrinho.atualizarQuantidade(ebook1, 5);
		
		carrinho.listEbooks();
		
		venda.calcTotal();
		
		System.out.println(venda.getAll());
		

	}

}
