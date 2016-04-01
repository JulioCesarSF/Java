package br.com.fiap.pessoas;

import br.com.fiap.bens.*;

public class PF {
	
	private String nome, cpf;
	private Veiculo veiculos;
	private Imovel imoveis;
	
	public PF() {}
	
	public PF(String nome, String cpf, Veiculo veiculos, Imovel imoveis) {
		this.nome = nome;
		this.cpf = cpf;
		this.veiculos = veiculos;
		this.imoveis = imoveis;
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
	public Veiculo getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(Veiculo veiculos) {
		this.veiculos = veiculos;
	}
	public Imovel getImoveis() {
		return imoveis;
	}
	public void setImoveis(Imovel imoveis) {
		this.imoveis = imoveis;
	}
	
	public String getAll(){
		String residencial = "Sim";
		String portas = "Este veículo não possui portas.";
		
		if(!this.imoveis.isResidencial())
			residencial = "Não";
		
		if(this.veiculos.getQtdePortas() != 0)
			portas = String.valueOf(this.veiculos.getQtdePortas());
			
		return "Dados Pessoais: \n"
				+"Nome: " + this.nome
				+ "\nCPF: " + this.cpf
				+ "\n\n-Veiculo: "
				+ "\n--Modelo: " + this.veiculos.getModelo()
				+ "\n--Motor: " + this.veiculos.getMotor()
				+ "\n--Portas: " + portas
				+ "\n\n-Imovel: " 
				+ "\n--Endereço: " + this.imoveis.getEndereco()
				+ "\n--Tamanho: " + this.imoveis.getTamanho()
				+ "\n--Valor: " + this.imoveis.getValor()
				+ "\n--Residencial: " + residencial;
	}

}
