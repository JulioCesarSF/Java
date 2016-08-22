package br.com.fiap.testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Telefone;
import br.com.fiap.excecoes.Excecoes;

public class Teste {

	public static String p(String t){
		return JOptionPane.showInputDialog(t);
	}
	
	public static void main(String[] args) throws Excecoes {
		List<Telefone> meusFones = new ArrayList<Telefone>();
		
		String sNome = new String(p("Digite o nome do cliente"));
		
		while(JOptionPane.showConfirmDialog(null, "Cadastrar Telefone?", 
				"ArrayList", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0){
			Telefone tel = new Telefone();
			tel.setDdd(Short.parseShort(p("DDD")));
			tel.setNumero(Integer.parseInt(p("Numero")));
			meusFones.add(tel);
		}
		
		Cliente pessoa = new Cliente();
		pessoa.setNome(sNome);
		pessoa.setTels(meusFones);
		
		System.out.println("Nome:\t" + pessoa.getNome());
		for(Telefone tel : pessoa.getTels()){
			System.out.println(tel.getTelefone());
		}

	}

}
