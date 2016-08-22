package br.com.fiap.beans;

import java.util.List;

public class Cliente {

	private String nome;
	List<Telefone> tels;

	public Cliente() {
	}

	public Cliente(String nome, List<Telefone> tels) {
		this.nome = nome;
		this.tels = tels;
	}

	public String getNome() {
		return nome;
	}

	public List<Telefone> getTels() {
		return tels;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTels(List<Telefone> tels) {
		this.tels = tels;
	}

}
