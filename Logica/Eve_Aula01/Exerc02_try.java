import java.util.Scanner;

public class Exerc02_try {
	
	public static void p(String t){
		System.out.println(t);
	}

	public static void main(String[] args) {
		String nomes[] = new String[10];
		
		try(Scanner t = new Scanner(System.in)){
			for(int i =0; i < nomes.length;i++){
				p("Digite o " + (i+1) + " nome:");
				nomes[i] = new String(t.nextLine());						
			}
			
			p("Qual nome buscar?");
			String achar = new String(t.nextLine());
			
			for(int i =0; i < nomes.length;i++)
				if(nomes[i].equalsIgnoreCase(achar))
					p("ACHEI - posição: " + (i+1));
				else
					p("Não Achei");
			
		}catch(Exception e){
			p("Ocorreu um erro: " + e);
		}

	}

}
