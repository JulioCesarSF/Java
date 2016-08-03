import java.util.Scanner;

public class Exerc01_try {

	public static void p(String texto){
		System.out.println(texto);
	}

	public static void main(String[] args) {
		
		float temp[] = new float[7];
		float media = 0f;
		int dias = 0;
		
		try(Scanner t = new Scanner(System.in)){
			for(int i =0; i < temp.length;i++){
				p("Digite a temperatura do " + (i+1) + " dia:");
				temp[i] = t.nextFloat();
				media+=temp[i];
			}
			
			media/=temp.length;
			
			for(float tmp : temp){
				if(tmp > media)
					dias++;
			}
			
			p("A média da temperatura na semana foi: " + media);
			p("A quantidade de dia(s) com temperatura(s) acima da média: " + dias);
		}catch (Exception e) {
			p("Ocorreu um erro: " + e);
		}		

	}

}
