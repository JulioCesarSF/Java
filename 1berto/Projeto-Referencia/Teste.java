package descanso.Test;

import javax.swing.JOptionPane;
import descanso.Mod.*;

public class Teste {
	
	public static String exibir(String msg){
		return JOptionPane.showInputDialog(msg);
	}

	public static void main(String[] args) {
		Cliente c = new Cliente();
				
		c.setNome(exibir("Nome"));
		c.setEmail(exibir("Email"));
		
		Telefone f = new Telefone();
		
		f.setOperadora(10);
		f.setNumero(32131832);
		f.setDdd(11);
		f.setRamal(1001);
		c.setFone(f);
		
		Endereco e = new Endereco();
		
		e.setBairro(exibir("Digite o Endereco"));
		e.setCep(Integer.parseInt(exibir("Digite o cep")));
		e.setCidade(exibir("Digite a cidade"));
		e.setLogradouro(exibir("Digite o logradouro"));
		e.setComplemento(exibir("Digite o complemento"));
		e.setUf(exibir("Digite o estado"));
		e.setNumero(exibir("Digite o número"));
		c.setEndereco(e);		

	}

}
