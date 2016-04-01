import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		/* atributos/variaveis */
		String palavra = new String();
		int numero;
		double salario;
		
		/* Instanciar o objeto Scanner com nome teclado 
		 * O Scanner retorna
		 *  next() e nextLine() String
		 *  nextInt() int 
		 *  e assim vai com os tipos
		 *  
		 *  Quando executar clique no "Console" para digitar
		 * */
		
		Scanner teclado = new Scanner(System.in);
		
		/* pegar tudo que vier antes do espaço: teclado.next()
		 * pegar a linha toda: teclado.nextLine() */
		
		// String
		System.out.println("Digite uma palavra: ");
		palavra = teclado.next() + teclado.nextLine();
		
		// int
		System.out.println("Digite um número: ");
		numero = teclado.nextInt();
		
		// double
		System.out.println("Digite um número com casa decimal ex: 3,14: ");
		salario = teclado.nextDouble();
		
		System.out.println("Palavra: " + palavra);
		System.out.println("Numero: " + numero);
		System.out.println("Salário: " + salario);
		
		teclado.close();

	}

}
