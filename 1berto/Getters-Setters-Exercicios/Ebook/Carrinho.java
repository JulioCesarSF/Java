package descansos.Ebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Carrinho {
	
	private String tipoEntrega;	
	private Map<Ebook, Integer> livro = new HashMap<Ebook, Integer>();
	private ArrayList<Double> valor = new ArrayList<Double>();
	
	
	
	public Carrinho() {
	}

	public Carrinho(String tipoEntrega, Map<Ebook, Integer> livro, ArrayList<Double> valor) {
		this.tipoEntrega = tipoEntrega;
		this.livro = livro;
		this.valor = valor;
	}

	public void updateValores(){
		valor.clear();
		for(Map.Entry<Ebook, Integer> item : livro.entrySet()){
			this.valor.add(item.getKey().getValor() * item.getValue());			
		}		
	}
	
	public void addEbook(Ebook ebook, int quantidade){
		if( (quantidade > 0) && (ebook != null)){
			livro.put(ebook, quantidade);
			this.valor.add(ebook.getValor() * quantidade);
		}		
	}
	
	public void delEbook(Ebook ebook){
		Double v = 0.0d;
		for(Map.Entry<Ebook, Integer> item : livro.entrySet()){
			if((item.getKey().getTitulo() == ebook.getTitulo())){
				v = item.getKey().getValor() * item.getValue();
				livro.remove(item.getKey());
				break;
			}			
		}
		this.valor.remove(v);		
	}
	
	public void listEbooks(){
		this.updateValores();
		String texto;
		for(Map.Entry<Ebook, Integer> item : livro.entrySet()){
			texto = "Título: " + item.getKey().getTitulo()
					+ " - Valor: " + item.getKey().getValor() 
					+ " - Quantidade: " + item.getValue()
					+ " - Total: " + (item.getValue() * item.getKey().getValor());
			System.out.println(texto);
		}
	}
	
	public void atualizarQuantidade(Ebook ebook, int quantidade){
		for(Map.Entry<Ebook, Integer> item : livro.entrySet()){
			if((item.getKey().getTitulo() == ebook.getTitulo())){				
				item.setValue(quantidade);				
				break;
			}
		}		
		this.updateValores();
	}
	
	public ArrayList<Double> getValores(){
		return this.valor;
	}
	
	public String getTipoEntrega() {
		return tipoEntrega;
	}
		
	public void setTipoEntrega(String tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}
		
}
