import java.text.NumberFormat;
import java.util.Scanner;
import java.util.StringJoiner;

public class Exerc04 {

	public static void main(String[] args) {
		
		NumberFormat nb = NumberFormat.getCurrencyInstance();

		int[][] produto = new int[5][2]; 

		double[][] subTotal = new double[5][2];

		double totalGeral = 0d;		

		try (Scanner t = new Scanner(System.in)) {

			for (int i = 0; i < produto.length; i++) {
				System.out.println("Produto " + (i + 1));

				System.out.print("Digite o código:");
				produto[i][0] = t.nextInt();
				System.out.print("Digite o preço:");
				subTotal[i][0] = t.nextDouble();
				System.out.print("Digite a quantidade:");
				produto[i][1] = t.nextInt();

				subTotal[i][1] = produto[i][1] * subTotal[i][0]; // subTotal

				totalGeral += subTotal[i][1];

				System.out.println("");
			}

			for (int i = 0; i < produto.length; i++) {
				System.out.println(new StringJoiner("\t").add("Código:" + produto[i][0]).add("Preço:" + subTotal[i][0])
						.add("Quantidade:" + produto[i][1]).add("Total:" + nb.format(subTotal[i][1])).toString());
			}			

			System.out.println("Total Geral:" + nb.format(totalGeral));

		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}

	}

}
