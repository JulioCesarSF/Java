package Beans;

import javax.swing.JOptionPane;

public class teste {
	
	public static String perguntar(String pergunta){
		return JOptionPane.showInputDialog(pergunta);
	}

	public static void main(String[] args) {
		Passagem p = new Passagem();
		/* info do passageiro */
		p.setAssento(perguntar("Digite o assento"));
		p.getPassageiro().setNome(perguntar("Digite o nome do passageiro"));
		p.getPassageiro().setCpf(perguntar("Digite o CPF do passageiro"));
		p.getPassageiro().setEndereco(perguntar("Digite o endere�o do passageiro"));
		p.getPassageiro().setBagagens(Integer.parseInt(perguntar("Digite a quantidade de bagagens do passageiro")));
		/* info do voo */
		p.setDe(perguntar("Digite o local de sa�da do v�o"));
		p.setDestino(perguntar("Digite o local de destino do v�o"));
		p.setDiaSaida(perguntar("Digite o dia de sa�da do v�o"));
		p.setHoraSaida(perguntar("Digite a hora de sa�da do v�o"));
		p.setLocalEmbarque(perguntar("Digite o local de embarque do v�o"));
		p.setPortao(perguntar("Digite o port�o de sa�da do v�o"));
		p.getEscala().setLocal(perguntar("Digite o local da escala"));
		p.getEscala().setDiaEscala(perguntar("Digite o dia da escala"));
		p.getEscala().setHoraEscala(perguntar("Digite o hor�rio da escala"));
		
		System.out.println(p.exibirTudo());
		
	}

}
