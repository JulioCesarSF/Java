package descanso8.Test;

import descanso8.Mod.*;

public class TesteCarro {

	public static void main(String[] args) {
		Carro c = new Carro();
		Cor cor = new Cor();
		
		cor.setNome("Prata");
		cor.setCorMetalica(true);
		cor.setPreco(1250.00);
		
		c.setFabricante("Ford");
		c.setModelo("Focus");
		c.setValor(90000.00);
		c.setCor(cor);
		
		c.addAcessorio("Ar-condicionado", true, 550.00);
		c.addAcessorio("Vidro Elétrico", true, 1350.90);
		c.addAcessorio("Aro 20", true, 5250.85);
		c.addAcessorio("Porta copo", true, 650.00);
		
		c.atualizarAcessorios("Ar-condicionado", false, 0); /* valor 0 = não mudar */
		c.delAcessorio("Porta copo");
		c.atualizarAcessorios("Aro 20", true, 2500.00);
		c.atualizarAcessorios("Ar-condicionado", true);
		c.atualizarAcessorios("Vidro Elétrico", false);
		
		c.exibirTudo();
		
	}

}
