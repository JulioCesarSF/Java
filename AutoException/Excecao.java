package br.com.fiap.excecao;

import br.com.fiap.Util.Arquivo;

@SuppressWarnings("serial")
public class Excecao extends Exception {
	
	public Excecao(){
		System.out.println("Erro");
	}
	
	public Excecao(Exception e) throws Exception{
		String mensagem = new String(tratar(e));
		System.out.println(mensagem);
	}
	
	public Excecao(Exception e, boolean stackTrace) throws Exception{
		String mensagem = new String(tratar(e));
		System.out.println(mensagem);
		
		if(stackTrace){
			System.out.println("-> StackTrace:");
			e.printStackTrace();
		}
	}
	
	public Excecao(String mensagem){
		super(mensagem);
	}
	
	public String tratar(Exception e) throws Exception{		
		String tratamento = new String(Arquivo.procurarExcecao(e.getClass().toString()));
		
		if(!tratamento.trim().isEmpty()){			
			return tratamento;
		}else{
			Arquivo.novaExcecao(e.getClass().toString());
			tratamento = new String(Arquivo.procurarExcecao(e.getClass().toString()));			
			return tratamento;
		}
	}

}
