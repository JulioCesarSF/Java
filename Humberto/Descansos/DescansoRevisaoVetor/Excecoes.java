package br.com.fiap.excecoes;

@SuppressWarnings("serial")
public class Excecao extends Exception {
	
	public Excecao(){
		print();
	}
	
	public Excecao(Exception e){
		super(e);
		print();
	}
	
	public Excecao(String msg, Exception e){
		super(msg + tratar(e), e);		
		print();
	}
	
	public Excecao(String msg, Exception e, boolean stack){
		super(msg + tratar(e), e);		
		print();
		
		if(stack)
			printTrace(e);
	}	
	
	public static String tratar(Exception e){
		
		if(e.getClass().toString().equals("class java.lang.NullPointerException")){
			return "NullPointer.";
		}else if(e.getClass().toString().equals("class java.lang.NumberFormatException")){
			return "Digitou diferente de número.";
		}else
			return "Erro sem tratamento";	
		
	}
	
	public void print(){		
		System.out.println("--- Tratando ---");		
		System.out.println(this.getMessage());		
		System.out.println("--- Finalizo ---");
		
	}
	
	public void printTrace(Exception e){
		System.out.println("--- Trace ---");
		e.printStackTrace();
		System.out.println("--- FIM ---");
	}
	

}
