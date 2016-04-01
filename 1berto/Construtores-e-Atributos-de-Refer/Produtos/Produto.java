import javax.swing.JOptionPane;

public class Produto {
	
	private int qnt;
	private double preco, desconto;
	private String nomeProduto;
	
	public Produto(){}
	
	public Produto(String nomeProduto, int qnt, double preco, double desconto){		
		this.nomeProduto = nomeProduto;	
		this.qnt = qnt;		
		this.preco = preco;
		this.desconto = desconto;
	}	
		
	public String perguntar(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	
	public double calcValor(){
		return preco - (preco*(desconto/100));
	}
	
	public double calcValor(double d){
		return preco - (preco*(d/100));
	}
	
	public double calcValorTotal(){
		if(qnt == 0)
			qnt = 1;
		return (preco - (preco*(desconto/100)))*qnt;
	}
	
	public double calcValorTotal(double d){
		if(qnt == 0)
			qnt = 1;
		return (preco - (preco*(d/100)))*qnt;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		if( (nomeProduto.length() <= 0) || (nomeProduto == null) )
			nomeProduto = this.perguntar("Digite o nome do Produto");
		this.nomeProduto = nomeProduto;
	}		
	
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) { /* não trata se só tem números digitados */
		if(qnt == 0)
			while(qnt == 0){
				String resposta = this.perguntar("Digite a quantidade do Produto\nNão pode ser 0.");
				if(resposta == null){
					this.qnt = 1;
					return;
				}else{
					qnt = Integer.parseInt(resposta);
				}
			}
		this.qnt = qnt;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) { /* não trata se só tem números digitados */
		while(preco == 0.0d){
			String resposta = this.perguntar("Digite o valor do Produto\nNão pode ser 0.");
			if(resposta == null)
				preco = 1;
			else
				preco = Double.parseDouble(resposta);
		}
		this.preco = preco;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}	

}
