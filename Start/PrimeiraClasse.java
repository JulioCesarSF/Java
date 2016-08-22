package exemplos.modulos;

public class PrimeiraClasse {
	
	/*
	 * O nome da classe sempre iniciará com letra maiuscula, ex : PrimeiraClasse
	 * O nome do arquivo deve acompanhar o nome da classe seguido de .java
	 * 
	 * A classe é composta de:
	 * 
	 * ATRIBUTOS
	 * 
	 * CONSTRUTORES (tem o mesmo nome da classe e não retornam valores)
	 * 
	 * MÉTODOS
	 * 
	 * 
	 * 
	 * */
	
	/* atributos */
	
	/*
	 * Atributos/Variáveis seguem uma assinatura:
	 * 
	 * VISIBILIDADE TIPO NOME
	 * 
	 * ex: private int numero;
	 *	private só essa classe tem acesso
	 *	int é o tiupo inteiro
	 *	numero é o nome do atributo
	 *
	 * não precisam ser inicializadas na declaração.
	 *
	 * 
	 * 	Visibilidade/Acessibilidade: 
	        | Class | Package | Subclass | World  = quem tem acesso
————————————+———————+—————————+——————————+———————
public      |  y    |    y    |    y     |   y
————————————+———————+—————————+——————————+———————
protected   |  y    |    y    |    y     |   n
————————————+———————+—————————+——————————+———————
no modifier |  y    |    y    |    n     |   n
————————————+———————+—————————+——————————+———————
private     |  y    |    n    |    n     |   n

y: accessible
n: not accessible
http://stackoverflow.com/questions/215497/difference-among-public-default-protected-and-private

	 *
	 * 
	 * */		
	
	private String nome;
	
	/* construtores */
	
	PrimeiraClasse(){}
	
	PrimeiraClasse(String nome){
		this.nome = nome;
	}
	
	/* métodos */
	
	/*Métodos seguem uma assinatura também
	 * 
	 * VISIBILIDADE RETORNO NOME (PARAMETROS)
	 * 
	 * A regras de visibilidade se aplicam.
	 * 
	 * RETORNO é um TIPO primitivo ou referência (no Java são OBJETOS/CLASSES)
	 * 
	 * PARAMETROS:
	 * 
	 * TIPO NOME
	 * ex: public int soma(int a, int b)
	 * 
	 * *** Normalmente você vai criar um get e um set para cada atributo (isso dá acesso para eles)
	 * 
	 * */
	
	public void setNome(String nome){
		this.nome =  nome;
	}
	
	public String getNome(){
		return this.nome; // o this não é obrigatório aqui pois não tenho parametro com o mesmo nome do atributo
	}
	
	/* THIS 
	 * o this é usado para fazer referência ao atributo da classe	 * 
	 * */
	

}
