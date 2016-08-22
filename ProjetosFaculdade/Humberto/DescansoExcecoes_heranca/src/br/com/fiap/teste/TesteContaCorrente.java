package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.beans.ContaCorrente;
import br.com.fiap.beans.Titular;
import br.com.fiap.excecoes.Excecoes;

public class TesteContaCorrente {

	public static String get(String msg) {
		return JOptionPane.showInputDialog(msg);
	}

	public static void main(String[] args) throws Excecoes {
		Titular t = new Titular();
		ContaCorrente cc = new ContaCorrente();

		cc.setTitular(t);

		try {
			cc.getTitular().setNome(get("Digite o nome do Titular"));
			cc.getTitular().setCpf(get("Digite o CPF do Titular"));
			cc.setAgencia(Integer.parseInt(get("Digite a agência")));
			cc.setNumeroConta(get("Digite o Número da conta"));
			cc.setSaldo(Double.parseDouble(get("Digite o Saldo da conta")));

			/* enunciado e) */

			// cc.sacar(5000.00);
			// cc.depositar(-1);
			// cc.setLimiteCredito(-1);

			cc.setLimiteCredito(1000.00);
			cc.depositar(50.00);
			cc.sacar(150.00);

			System.out.println(cc.getTudo());

		} catch (Exception e) {
			throw new Excecoes(e, false);
			// System.out.println(e.getMessage());
		} finally {
			System.out.println("-> Fim da execução");
		}

	}

}
