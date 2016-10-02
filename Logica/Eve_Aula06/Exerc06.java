import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {

		int[][] chamado = new int[5][3];

		try (Scanner t = new Scanner(System.in)) {

			captar(chamado, t);
			
			relatorioErro(chamado);
			
			qtd(chamado);

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}
	
	public static void qtd(int[][] chamado){
		int a = 0, b = 0, c = 0, d= 0;
		for (int i = 0; i < chamado.length; i++) {
			if (chamado[i][2] == 1)
				a++;
			else if (chamado[i][2] == 2)
				b++;
			else if( chamado[i][2] == 3)
				c++;
			else if(chamado[i][2] == 4)
				d++;
		}
		
		System.out.println("RELATÓRIO POR CRITÉRIO");
		System.out.println("Sistema parado: " + a);
		System.out.println("Grave:" + b);
		System.out.println("Não Grave: " + c);
		System.out.println("Dúvida ou questão: " + d);
	}

	public static void relatorioErro(int[][] chamado) {
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < chamado.length; i++) {
			if (chamado[i][1] == 1)
				a++;
			else if (chamado[i][1] == 2)
				b++;
			else
				c++;
		}

		System.out.println("RELATÓRIO DE CHAMDOS POR ERRO");
		System.out.println("Código erro 1: " + a);
		System.out.println("Código erro 2: " + b);
		System.out.println("Código erro 3: " + c);
	}

	private static void captar(int[][] chamado, Scanner t) {
		for (int i = 0; i < chamado.length; i++) {
			System.out.println("Chamado (" + (i + 1) + "):");
			System.out.print("Identificação do func:");
			chamado[i][0] = t.nextInt();
			System.out.print("Código de erro:");
			do {
				chamado[i][1] = t.nextInt();
			} while (!validaCodigo(chamado[i][1]));
			System.out.print("Critério:");
			do {
				chamado[i][2] = t.nextInt();
			} while (!validaCriterio(chamado[i][2]));
		}
	}

	public static boolean validaCodigo(int i) {
		if (i <= 0 || i > 3)
			return false;
		return true;
	}

	public static boolean validaCriterio(int i) {
		if (i <= 0 || i > 4)
			return false;
		return true;
	}

}
