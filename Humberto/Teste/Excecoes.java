package com.julio.exception;

@SuppressWarnings("serial")
public class Excecoes extends Exception {
	
	private String texto;	
	
	public Excecoes(Exception e, boolean stackTrace){
		super();
		texto = "Erro:";	
		this.getErro(e);
		if(stackTrace)
			e.printStackTrace();
	}
	
	public Excecoes(String descricao, Exception e, boolean stackTrace){
		super();
		texto = "Erro (" + descricao;	
		this.getErro(e);
		if(stackTrace)
			e.printStackTrace();
	}
	
	//trocar pelo StringBuilder para usar append 
	private void getErro(Exception e){
		if(e.getClass().toString().equals("class java.lang.NumberFormatException")){
			texto+=" NumberFormatException";
		}else if(e.getClass().toString().equals("class java.lang.ArithmeticException")){
			texto+=" ArithmeticException";
		}else if(e.getClass().toString().equals("class java.lang.ArrayIndexOutOfBoundsException")){
			texto+=" ArrayIndexOutOfBoundsException";
		}else if(e.getClass().toString().equals("class java.lang.IndexOutOfBoundsException")){
			texto+=" ArrayIndexOutOfBoundsException";
		}else if(e.getClass().toString().equals("class java.lang.NullPointerException")){
			texto+=" NullPointerException";
		}else
			texto+=" Erro não tratado.";
		
		this.print();
	}	
	
	public String toString(){		
		return texto;
	}	
	
	public void print(){
		System.out.println(toString());
	}

}
