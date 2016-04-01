package br.com.fiap.tds.ltp.sistemabanco.entidades;

public class Endereco {
	
	private String rua, complemento, bairro, cep;
	private short numero;	
	
	public Endereco() {}

	public Endereco(String rua, String complemento, String bairro, String cep, short numero) {
		this.rua = rua;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.numero = numero;
	}

	public short getNumero(){
		return this.numero;
	}
	
	public void setNumero(short novoNumero){
		this.numero = novoNumero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}	

}
