package br.com.fiap.excecoes;

@SuppressWarnings("serial")
public class Excecoes extends Exception {
	
	public Excecoes(String mensagem, Exception e){
		super(mensagem, e);
		
		if(e.getClass().toString().equals("class java.lang.NumberFormatException")){
			System.out.println("Número inválido!");
		}else if(e.getClass().toString().equals("class java.lang.ArithmeticException")){
			System.out.println("Divisão por 0.");
		}
		
		
		this.print();
		//e.printStackTrace(); //informar qual camada gerou e erro e por onde passou
	}
	
	public Excecoes(String mensagem){
		super(mensagem);
	}
	
	public void print(){
		System.out.println("====== Tratando =====");
		System.out.println(getMessage());
		System.out.println("PrintStackmessage");
	}
}
