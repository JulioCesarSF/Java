package Beans;

public class Passagem extends Voo{
	
	private Passageiro passageiro;
	private String assento;
	
	public Passagem() {
		passageiro = new Passageiro();
		assento = new String();
	}
	
	public Passagem(String nome, String cpf, String endereco, int bagagens, String assento,
			String de, String destino, String localEmbarque, String portao, String diaSaida, String horaSaida){
		super(de, destino, localEmbarque, portao, diaSaida, horaSaida);
		passageiro = new Passageiro(nome, cpf, endereco, bagagens);
		this.assento = assento;
	}
	
	public Passagem(String nome, String cpf, String endereco, int bagagens, String assento,
			String de, String destino, String localEmbarque, String portao, String diaSaida, String horaSaida, 
			String localEscala, String diaEscala, String horaEscala){
		super(de, destino, localEmbarque, portao, diaSaida, horaSaida, localEscala, diaEscala, horaEscala);
		passageiro = new Passageiro(nome, cpf, endereco, bagagens);
		this.assento = assento;
	}
	
	public String exibirTudo(){
		String retorno = new String("->Informaçoes Passageiro:\n"
				+"\nNome:\t\t" + this.getPassageiro().getNome()
				+"\nCPF:\t\t" + this.getPassageiro().getCpf()
				+"\nEndereço:\t" + this.getPassageiro().getEndereco()
				+"\nBagagens:\t" + this.getPassageiro().getBagagens()
				+"\n\n->Informações Voo:\n"
				+"\nDe:\t" + super.getDe()	+ "\tDestino:\t" + super.getDestino()
				+"\nSaída:\t" + super.getDiaSaida() + " " + super.getHoraSaida()
				+"\nLocal embarque:\t" + super.getLocalEmbarque()
				+"\nPortão:\t" + super.getPortao()
				+"\n\n->Informações Escala:\n"
				+"\nLocal escala:\t" + this.getEscala().getLocal()
				+"\nDia:\t" + this.getEscala().getDiaEscala() + " " + this.getEscala().getHoraEscala());
		return retorno;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public String getAssento() {
		return assento;
	}

	public void setAssento(String assento) {
		this.assento = assento;
	}
}
