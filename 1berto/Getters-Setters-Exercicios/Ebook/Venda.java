package descansos.Ebook;

public class Venda {
	
	private String formaPgto, cupomDesconto;
	private Carrinho carrinho;
	private double total;
	private Cliente cliente;	
	
	public Venda() {
	}
	public Venda(String formaPgto, String cupomDesconto, Carrinho carrinho, double total, Cliente cliente) {
		this.formaPgto = formaPgto;
		this.cupomDesconto = cupomDesconto;
		this.carrinho = carrinho;
		this.total = total;
		this.cliente = cliente;
	}
	public String getFormaPgto() {
		return formaPgto;
	}
	public void setFormaPgto(String formaPgto) {
		this.formaPgto = formaPgto;
	}
	public String getCupomDesconto() {
		return cupomDesconto;
	}
	public void setCupomDesconto(String cupomDesconto) {
		this.cupomDesconto = cupomDesconto;
	}
	public Carrinho getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void calcTotal(){
		this.total = 0;
		for(int i = 0 ; i < carrinho.getValores().size(); i++){
			this.total += carrinho.getValores().get(i); 
		}
	}

	public String getAll(){
		return 	"VALOR TOTAL: R$ " + String.format("%.2f", this.total) + "\n"
				+ "Cupom: " + this.cupomDesconto + " - " + "Forma Pagto: " + this.formaPgto + "\n"
				+ "Forma de envio: " + carrinho.getTipoEntrega();
	}	

}
