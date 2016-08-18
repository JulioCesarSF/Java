package br.com.fiap.excecoes;

@SuppressWarnings("serial")
public class Excecoes extends Exception {
	
	public Excecoes(String msg){
		super(msg);		
	}
	
	public Excecoes(String msg, Exception e){
		super(msg, e);
	}
	
	public Excecoes(String msg, Exception e, boolean stack){
		super(msg, e);		
		System.out.println(tratar(e));
		
		if(stack)
			print();
	}
	
	private String tratar(Exception e){
		if(e.getClass().toString().equals("class java.lang.NumberFormatException"))
			return "Digite corretamente o número.";
		else if(e.getClass().toString().equals("class java.lang.ArrayIndexOutOfBoundsException"))
			return "Index maior que array!";
		else if(e.getClass().toString().equals("class java.lang.NullPointerException"))
			return "NullPointer";
		else if(e.getClass().toString().equals("class java.util.ConcurrentModificationException")){
			return "Ops...";
		}else
			return "Erro sem tratamento especial.";
			
	}
	
	private void print(){
		System.out.println("---- Tratando ----");
		System.out.println(this.getMessage());
		System.out.println("----   FIM    ----");
	}
	

}
