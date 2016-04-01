package descanso7.Test;

import descanso7.Mod.*;

public class TesteContaCorrent {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		
		conta.setTitular("Júlio");
		conta.setAgenciaContaCorrente(234);
		conta.setNumeroContaCorrente("38923");
		conta.deposito(100);
		
		System.out.println("saldo: R$" + String.format("%.2f", conta.getSaldo()) );

		conta.saque(20);
		
		System.out.println("Agência: " + conta.getAgenciaContaCorrente() 
		+ " Conta-corrente: " + conta.getNumeroContaCorrente());
		
		conta.exibirSaldo();

	}

}
