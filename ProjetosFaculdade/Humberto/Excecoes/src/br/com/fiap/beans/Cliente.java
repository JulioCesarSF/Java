package br.com.fiap.beans;

public class Cliente {
	private String nome;
	private byte qtdeEstrelas;
	private long codigo;
	
	public Cliente(){ super();}

	public Cliente(String nome, byte qtdeEstrelas, long codigo) {
		super();
		this.nome = nome;
		this.qtdeEstrelas = qtdeEstrelas;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public byte getQtdeEstrelas() {
		return qtdeEstrelas;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setQtdeEstrelas(byte qtdeEstrelas) {
		this.qtdeEstrelas = qtdeEstrelas;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	

}
