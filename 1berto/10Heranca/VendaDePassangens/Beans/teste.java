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
		p.getPassageiro().setEndereco(perguntar("Digite o endereço do passageiro"));
		p.getPassageiro().setBagagens(Integer.parseInt(perguntar("Digite a quantidade de bagagens do passageiro")));
		/* info do voo */
		p.setDe(perguntar("Digite o local de saída do vôo"));
		p.setDestino(perguntar("Digite o local de destino do vôo"));
		p.setDiaSaida(perguntar("Digite o dia de saída do vôo"));
		p.setHoraSaida(perguntar("Digite a hora de saída do vôo"));
		p.setLocalEmbarque(perguntar("Digite o local de embarque do vôo"));
		p.setPortao(perguntar("Digite o portão de saída do vôo"));
		p.getEscala().setLocal(perguntar("Digite o local da escala"));
		p.getEscala().setDiaEscala(perguntar("Digite o dia da escala"));
		p.getEscala().setHoraEscala(perguntar("Digite o horário da escala"));
		
		System.out.println(p.exibirTudo());
		
	}

}
