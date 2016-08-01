import java.util.Scanner;

public class Exerc03 {

	public static void p(String t){
		System.out.println(t);
	}

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		String nomes[] = new String[10];
		
		for(int i  =0; i < nomes.length; i++){
			p("Digite o " + (i+1) + " nome:");
			nomes[i] = new String(t.nextLine());
		}
		
		p("Qual nome você gostaria de buscar?");
		String achar = new String(t.nextLine());
		
		for(String nome : nomes){
			if(nome.equalsIgnoreCase(achar))
				p("Achei");
		}		
		
		t.close();

	}

}
