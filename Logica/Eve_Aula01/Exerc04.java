import java.util.Scanner;

public class Exerc04 {
	
	public static void p(String t){
		System.out.println(t);
	}

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		float temps[] = new float[12];
		String mes[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };
		
		float maior = 0f;
		float menor = 100f;
		String mesMaior = new String();
		String mesMenor = new String();

		for (int i = 0; i < temps.length; i++) {
			p("Informe a temperatura do mês de " + mes[i] + ":");
			temps[i] = t.nextFloat();
			
			if(temps[i] > maior){
				maior = temps[i];
				mesMaior = mes[i];
			}
			
			if(temps[i] < menor){
				menor = temps[i];
				mesMenor = mes[i];
			}
 
		}
		
		p("Maior temperatura " + maior + " graus ocorrida em: " + mesMaior);
		p("Menor temperatura " + menor + " graus ocorrida em: " + mesMenor);
		
		t.close();

	}

}
