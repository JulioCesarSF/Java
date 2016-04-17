package Beans;

public class Passageiro {
	
	private String nome, cpf, endereco;
	private int bagagens;

	public Passageiro() {
		nome = new String();
		cpf = new String();
		endereco = new String();
		bagagens = 0;
	}
	
	public Passageiro(String nome, String cpf, String endereco, int bagagens){
		this.nome = new String(nome);
		this.cpf = new String(cpf);
		this.endereco = new String(endereco);
		this.bagagens = bagagens;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getBagagens() {
		return bagagens;
	}

	public void setBagagens(int bagagens) {
		this.bagagens = bagagens;
	}	
}
