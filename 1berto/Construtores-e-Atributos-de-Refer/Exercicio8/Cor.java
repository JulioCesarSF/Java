package descanso8.Mod;

public class Cor {
	
	private String nome;
	private boolean corMetalica;
	private double preco;
	
	public Cor() {}
	
	public Cor(String nome, boolean corMetalica, double preco) {
		this.nome = nome;
		this.corMetalica = corMetalica;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isCorMetalica() {
		return corMetalica;
	}
	public void setCorMetalica(boolean corMetalica) {
		this.corMetalica = corMetalica;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double novoPreco) {
		this.preco = novoPreco;
	}
	
	public void exibir(){
		System.out.println("\nCor: \n"
				+ "Nome: " + this.nome);
		if(this.corMetalica)
			System.out.print("Cor metálica: Sim");
		else
			System.out.print("Cor metálica: não"); 
		System.out.print(" Preço: R$" + this.preco);
	}

}
