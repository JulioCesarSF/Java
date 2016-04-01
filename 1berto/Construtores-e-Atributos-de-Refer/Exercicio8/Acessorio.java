package descanso8.Mod;

public class Acessorio {
	
	private String nome;
	private boolean possui;
	private double valor;
		
	public Acessorio() {}
	
	public Acessorio(String nome, boolean possui, double valor) {
		this.nome = nome;
		this.possui = possui;
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isPossui() {
		return possui;
	}
	public void setPossui(boolean possui) {
		this.possui = possui;
	}

}
