import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		/* JOptionPane vai exibir um tela conforme a método usado, 
		 * para exibir ou pegar algum dado do usuário.
		 * 
		 * Input: JOptionPane.showInputDialog("MENSAGEM")
		 * 
		 * Output: JOptionPane.showMessageDialog(LOCAL, "MENSAGEM")
		 * -LOCAL vai ser null por que não tem nenhuma janela para mostrar a mensagem
		 * 
		 * Para receber outros tipos além do String tem de converter usando: Integer.parseInt 
		 * e assim vai com todos os tipos.
		 * 
		 * Assim, no Java existem os tipos primitivos que começam com letra minuscula, ex: int, double
		 * E os tipos de referência que são clases, ex: Integer, Double, etc. que possuem métodos.
		 * 
		 * */
		
		String nome = new String();
		
		nome = JOptionPane.showInputDialog("Digite um nome");
		
		JOptionPane.showMessageDialog(null, nome);
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
		
		JOptionPane.showMessageDialog(null, numero);		

	}

}
