package br.com.fiap.tds.ltp.sistemabanco.entidades;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();		
		cc.setSaldo(7950.33);
		
		Endereco e = new Endereco();
		e.setRua("Alagoas");
		e.setNumero((short)33);
		e.setComplemento("AP 07");
		e.setBairro("Brás");
		e.setCep("85561-387");	
		
		Cliente c = new Cliente();		
		c.setEndereco(e);
		c.setNome("Olavo de Carvalho");
		c.setCpf("369.785.699-12");
		
		cc.setTitular(c);
		
		System.out.println(cc.representar());
	}

}
