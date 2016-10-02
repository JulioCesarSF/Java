import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc08 {

	static int[] arrayQuant = new int[5];

	public static void main(String[] args) {
		String[] arrayCarro = new String[] { "Classic", "Cobalt", "Onix", "Prisma", "Cruze" };
		double[] arrayPreco = new double[] { 33600, 44900, 37790, 43150, 55400 };

		relatorioGerencial(arrayCarro, arrayPreco);

	}

	/* Enunciado A */
	public static int[][] qtdVendida(String[] arrayCarro) {
		int[][] qtd = new int[4][5];
		Scanner t = new Scanner(System.in);
		for (int i = 0; i < qtd.length; i++) {
			System.out.println("Vendas " + (i + 1) + " TRI");
			for (int j = 0; j < qtd.length + 1; j++) {
				System.out.print("Carro " + arrayCarro[j] + ":");
				qtd[i][j] = t.nextInt();
			}
		}
		t.close();
		return qtd;
	}

	/* Enunciado B */
	public static int[] totalVendidoPorCarro(int[][] qtd, double[] arrayPreco) {
		int[] arrayQuant = new int[5];
		for (int i = 0; i < qtd.length + 1; i++) {
			for (int j = 0; j < qtd.length; j++) {
				arrayQuant[i] += qtd[j][i];
			}
		}
		return arrayQuant;
	}
  /* Enunciado C */	
	public static void relatorioGerencial(String[] arrayCarro, double[] arrayPreco) {
		arrayQuant = totalVendidoPorCarro(qtdVendida(arrayCarro), arrayPreco);
		System.out.println("\nRELATÓRIO GERENCIAL VIGORITO\n");
		DecimalFormat df = new DecimalFormat("R$ ###,###.00");
		double soma = 0d;
		for (int i = 0; i < arrayQuant.length; i++) {
			soma += (arrayQuant[i] * arrayPreco[i]);
			System.out.println("Carro:" + arrayCarro[i] + "\tQuantidade Geral: " + arrayQuant[i] + "\tTotal:"
					+ df.format(arrayQuant[i] * arrayPreco[i]));
		}
		System.out.println("Total Geral de Venda 2014:" + df.format(soma));
	}

}
