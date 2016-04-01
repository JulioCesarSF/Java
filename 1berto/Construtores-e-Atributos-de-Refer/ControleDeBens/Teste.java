package br.com.fiap.testes;

import br.com.fiap.bens.Imovel;
import br.com.fiap.bens.Veiculo;
import br.com.fiap.pessoas.*;

public class Teste {

	public static void main(String[] args) {
		
		PF p = new PF();
		p.setNome("Júlio");
		p.setCpf("3000000000");
		
		Veiculo v = new Veiculo();
		v.setModelo("Focus");
		v.setMotor("2.0");
		v.setQtdePortas(4);
		
		Imovel i = new Imovel();
		i.setEndereco("Av. Paulista");
		i.setTamanho(231);
		i.setValor(1000000.01);
		i.setResidencial(true);
		
		p.setVeiculos(v);
		p.setImoveis(i);
		
		System.out.println(p.getAll());
	}

}
