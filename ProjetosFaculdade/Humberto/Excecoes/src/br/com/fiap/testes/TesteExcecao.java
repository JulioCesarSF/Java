package br.com.fiap.testes;

import javax.swing.JOptionPane;

/*erro =/= excecao
 * 
 * erro, programou mal
 * 
 * excecao, você nao controla 
 * -- Unckecked : JVM nao se preocupa antes
 * -- Checked: antes da compilação * 
 */

public class TesteExcecao {

	public static String p(String t) {
		return JOptionPane.showInputDialog(t);
	}

	public static void main(String[] args) {
		int i = 23;
		int j = 0;
		double res = 0d;
		try {
			j = Integer.parseInt(p("digite um numero"));
			res = i / j;
			System.out.println(i + " / " + j + " = " + res);
		} catch (ArithmeticException e) {
			System.out.println("Não pode dividir por 0.\t" + e);
		} catch (Exception e) {
			System.out.println("Erro desconhecido!\t" + e);
		} finally {
			System.out.close();
		}

	}

}
