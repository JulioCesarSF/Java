public class InstanciarObjeto {	
	
	public static void main(String[] args) {
		
		/* para "usar" a classe deve-se instanciar ela 
		 * para isso deve-se importar a classe caso esteja em outro pacote, ex: import exemplo.modulos.PrimeiraClasse
		 * 
		 * Para instanciar o objeto:
		 * 
		 * NOME_DA_CLASSE NOME_DO_OBJETO = new NOME_DA_CLASSE()
		 * 
		 * Traduzindo:
		 * 
		 * PrimeiraClasse pClasse = new PrimeiraClasse()
		 * 
		 * É uma assinatura também:
		 * 
		 * CLASSE NOME_OBJETO = new CONSTRUTOR
		 * 
		 * NOME_OBJETO pode ser o que você quiser, é um identificador nada mais.
		 * 
		 * */
		
		PrimeiraClasse pClass = new PrimeiraClasse();
		
		/* para acessar os métodos da classe usa-se o NOME_DO_OBJETO.MÉTODO ex: pClass.setNome()*/
		
		pClass.setNome("Júlio");
		
		System.out.println("Nome: " + pClass.getNome());		

	}

}
