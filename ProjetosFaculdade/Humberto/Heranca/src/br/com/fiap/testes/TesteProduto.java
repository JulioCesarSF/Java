package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cd;
import br.com.fiap.beans.ItemPedido;
import br.com.fiap.beans.Livro;
import br.com.fiap.beans.Pedido;
import br.com.fiap.beans.Produto;

public class TesteProduto {
	/*
	static String str(String t){
		return JOptionPane.showInputDialog(t);
	}
	
	static int inteiro(String t){
		return Integer.parseInt
		(JOptionPane.showInputDialog(t));
	}
	
	static double decimal(String t){
		return Double.parseDouble
		(JOptionPane.showInputDialog(t));
	} */
	
	public static void main(String[] args) {
		String x = (JOptionPane.showInputDialog("Digite Livro ou Cd"));
		
		Produto objProduto;
		
		
		if(x.toUpperCase().equals("LIVRO")){
		
		
		objProduto = new Livro(
				//str("Digite  o autor"),
				JOptionPane.showInputDialog("Digite  o autor"),
				JOptionPane.showInputDialog("Digite a editora"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o total de p�ginas")),
				JOptionPane.showInputDialog("Digite a descri��o"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo")));
				
				JOptionPane.showMessageDialog(null, objProduto.getTudo());
		}else{
	
		objProduto = new Cd(
				JOptionPane.showInputDialog("Digite o artista"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o total de faixas")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite a dura��o")),
				Boolean.parseBoolean(JOptionPane.showInputDialog("Lan�amento?")),
				JOptionPane.showInputDialog("Digite a descri��o"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo")));
				
				JOptionPane.showMessageDialog(null, objProduto.getTudo());
		}
		
		Pedido objPedido = new Pedido(
				Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero do pedido")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o total do pedido")),
				JOptionPane.showInputDialog("Digite a data do pedido"));
		
				JOptionPane.showMessageDialog(null, objPedido.getTudo());
					
				
				
				ItemPedido objItem = new ItemPedido(
				objPedido,
				objProduto,
				Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade")));
		
				JOptionPane.showMessageDialog(null, objItem.getTudo());
		
	}
	

}
