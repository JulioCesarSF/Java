import javax.swing.JOptionPane;

public class Operadores {
	
	public static String perguntar(){		
		return JOptionPane.showInputDialog(null, "Qual a operação?" + "\n (*) multiplicar int" 
				+ "\n (/) dividir double" + "\n (%) resto de divisão entre int" 
				+ "\n (+=) Incrementar um valor"
				+ "\n (sair) Sair", "Operação", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static String getNum(){
		return JOptionPane.showInputDialog(null, "Digite um número:");
	}
	
	public static void main(String[] args) {
		
		boolean rodando = true;
		
		while(rodando){
			
			String opcao = perguntar();
			
			if( (opcao == null) || (opcao.length() <= 0))
			{
				rodando = false;
				break;
			}
			
			switch (opcao){
			
			case "*":
			{	
				int x = Integer.parseInt(getNum());
				int y = Integer.parseInt(getNum());
				int m = x * y;
				System.out.println("Multiplicando " + x + " * " + y + " = " + m);			
			}break;
			
			case "/":
			{
				double x = Double.parseDouble(getNum());
				double y = Double.parseDouble(getNum());
				double d = x / y;
				System.out.println("Dividindo " + x + " / " + y + " = " + d);
			}break;
			
			case "%":
			{
				int x = Integer.parseInt(getNum());
				int y = Integer.parseInt(getNum());
				int r = x % y;
				System.out.println("Resto da divisão " + x + " / " + y + " = " + r);
			}break;
			
			case "+=":
			{			
				int m = Integer.parseInt(getNum());
				m++;
				System.out.println("Incrementando " + m + " em +1 = " + m);
			}break;
			
			case "sair":
			{
				rodando = false;
			}break;
			
			default:
				perguntar();
			}		
		
		};	
		
			
		/*
		int m = 2 * 10;
		System.out.println("Multiplicando 2*10 = " + m);	
		double d = 10 / 2;
		System.out.println("Dividindo 10 por 2 = " + d);	
		int r = 10 % 3;
		System.out.println("Resto da divisão 10/3=" + r);
		int i = m++;
		System.out.println("Incrementando " + i + " em 1 = " + m);
		*/
		
	}

}
