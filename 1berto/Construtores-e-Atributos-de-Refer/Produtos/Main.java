
public class Main {

	public static void main(String[] args) {
		
		Produto p = new Produto("Coca-Cola", 4, 5.50, 10);		
		Produto p2 = new Produto("Salgadinho", 2, 7.89, 0);		
		Produto p3 = new Produto("Churros", 3, 4.50, 10);
				
		double total = p.calcValorTotal() + p2.calcValorTotal() + p3.calcValorTotal();
		
		System.out.println("Conta: \n"
				+ p.getNomeProduto() + "(" + p.getQnt() + ") Valor: R$" + p.getPreco() + " Desconto: " + p.getDesconto() + "% SubTotal: R$" + String.format("%.2f", p.calcValorTotal()) + "\n"
				+ p2.getNomeProduto() + "(" + p2.getQnt() + ") Valor: R$" + p2.getPreco() + " Desconto: " + p2.getDesconto() + "% SubTotal: R$" + String.format("%.2f", p2.calcValorTotal()) + "\n"
				+ p3.getNomeProduto() + "(" + p3.getQnt() + ") Valor: R$" + p3.getPreco() + " Desconto: " + p3.getDesconto() + "% SubTotal: R$" + String.format("%.2f", p3.calcValorTotal()) + "\n"
				+ "Valor Total: R$ " + String.format("%.2f", total));
		
		/*teste de métodos		
		System.out.println("\nTeste de métodos");
		Produto t = new Produto();
		t.setNomeProduto("ProdutoTeste");
		t.setQnt(20);
		t.setPreco(3.99);
		t.setDesconto(10);
		System.out.println("Nome do Produto: " + t.getNomeProduto()
						+"\nQuantidade: " + t.getQnt()
						+"\nValor: " + t.getPreco()
						+"\nDesconto em %: " + t.getDesconto());
		System.out.println("Unitário: R$ " + String.format("%.2f", t.calcValor()));
		System.out.println("Total do produto com quantidade: R$ " + String.format("%.2f", t.calcValorTotal()));
		
		
		t.setQnt(0);
		t.setPreco(0);
		System.out.println("Total do produto com quantidade: R$ " + String.format("%.2f", t.calcValorTotal()));
		*/
	}

}
