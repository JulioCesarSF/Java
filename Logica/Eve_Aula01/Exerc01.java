import java.util.Scanner;

public class Exerc01 {
	
	public static void p(String texto){
		System.out.println(texto);
	}

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		float temp[] = new float[7];		
		float media = 0f;		
		int dias = 0;
		
		for(int i = 0; i < temp.length; i++){
			p("Digite uma temperatura do "+ (i+1) + " dia:");
			temp[i] = t.nextFloat();
			media+=temp[i];
		}
		
		media/=temp.length;
		
		for(float tmp : temp){
			if(tmp > media)
				dias++;
		}
		
		p("A média da temperatura na semana foi: " + media);
		p("A quantidade de dia(s) com temperatura acima da média: " + dias);
		
		t.close();

	}

}
