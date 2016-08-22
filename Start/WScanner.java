import java.util.Scanner;

/**
 * 
 * Classe para fazer uma pergunta com println 
 * e retornar o que foi lido de acordo com o método usado 
 * 
 */
public class WScanner {
	
	Scanner teclado;

	/**
	 * Inicializar Scanner como System.in (input)
	 */
	public WScanner() {
		teclado = new Scanner(System.in);
	}
	
	/**
	 * Apenas realiza a saída de um texto com println
	 * 
	 * @param pergunta
	 */
	public void p(String texto){
		System.out.println(texto);
	}
	
	public void p(long numero){
		System.out.println(numero);
	}
	
	public void p(double numero){
		System.out.println(numero);
	}
	
	public void p(float numero){
		System.out.println(numero);
	}
	
	public void p(byte numero){
		System.out.println(numero);
	}
	
	public void p(int numero){
		System.out.println(numero);
	}
	
	public void p(char caracter){
		System.out.println(caracter);
	}
	
	public void p(boolean bool){
		System.out.println(bool);
	}
	
	/**
	 * 
	 * Pergunta com println e retorno da linha toda em String
	 * 
	 * @param pergunta
	 * @return String
	 */
	public String pS(String pergunta){
		p(pergunta);
		String texto = new String(teclado.next() + teclado.nextLine());
		return texto;
	}
	
	/**
	 * @param pergunta
	 * @return int
	 */
	public int pI(String pergunta){
		p(pergunta);
		return teclado.nextInt();
	}
	
	/**
	 * @param pergunta
	 * @return double
	 */
	public double pD(String pergunta){
		p(pergunta);
		return teclado.nextDouble();
	}
	
	/**
	 * @param pergunta
	 * @return float
	 */
	public float pF(String pergunta){
		p(pergunta);
		return teclado.nextFloat();
	}
	
	/**
	 * @param pergunta
	 * @return byte
	 */
	public byte pB(String pergunta){		
		p(pergunta);
		return teclado.nextByte();
	}
	
	/**
	 * @param pergunta
	 * @return short
	 */
	public short pShort(String pergunta){
		p(pergunta);
		return teclado.nextShort();
	}
	
	/**
	 * @param pergunta
	 * @return long
	 */
	public long pL(String pergunta){
		p(pergunta);
		return teclado.nextLong();
	}
	
	/**
	 * 
	 * Passar a posição que quer pegar o char no que foi digitado
	 * Por exemplo, 0 é a primeira posição.
	 * 
	 * @param pergunta
	 * @param posicaoChar
	 * @return char
	 */
	public char pC(String pergunta, int posicaoChar){
		p(pergunta);
		return (teclado.next() + teclado.nextLine()).charAt(posicaoChar);
	}
	
	/**
	 * 
	 * Digitar true, false
	 * 
	 * @param pergunta
	 * @return boolean
	 */
	public boolean pBoolean(String pergunta){
		p(pergunta);
		return teclado.nextBoolean();
	}
	
	/**
	 * Fechar o uso do Scanner
	 */
	public void end(){
		teclado.close();
	}

}
