package br.com.fiap.testes;

/*
 * Como gerar as exceções mais básicas 
 *	1) "java.lang.ArrayIndexOutOfBoundsException" 
 *	2) "java.lang.NumberFormatException"
 *	3) "java.lang.NullPointerException"
 *	4) "java.lang.ArithmeticException"
 */

public class Teste {

	public static void main(String[] args) {

		/*
		 * 1) "java.lang.ArrayIndexOutOfBoundsException"
		 * 
		 * Essa exceção ocorre quando você tenta usar um indice maior que o
		 * vetor
		 * 
		 * Neste caso o vetor tem tamanho 1 e eu tento colocar o valor 10 no
		 * indice 5.
		 */
		
		/*
		 * int[] i = new int[1]; i[5] = 10;
		 */

		/*
		 * 2) "java.lang.NumberFormatException"
		 * 
		 * Essa exceção ocorre quando o valor esperado é um número e você passa
		 * uma String
		 * 
		 * Se você executar a linha abaixo e digitar um letra ocorre a exceção
		 */

		/*
		 * double valor =
		 * Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		 */

		/*
		 * 3) "java.lang.NullPointerException"
		 * 
		 * Essa exceção ocorre quando você tenta utilizar um objeto que não foi
		 * instânciado
		 * 
		 * Por exemplo eu tentei pegar o tamanho ("length()") da String texto,
		 * só que ela não foi instanciada
		 */
		
		/*
		 * String texto = null; int tamanho = texto.length();
		 */

		/*
		 * 4) "java.lang.ArithmeticException"
		 * 
		 * Erro matemática, neste caso divisão por 0
		 */

		/*int a = 1;
		int b = 0;
		int c = a / b;*/

	}

}
