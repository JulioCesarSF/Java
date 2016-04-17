package Beans;

public class Voo {
	
	private String de, destino, localEmbarque, portao;
	private String diaSaida, horaSaida;
	private Escala escala;

	public Voo() {
		de = new String();
		destino = new String();
		localEmbarque = new String();
		portao = new String();
		diaSaida = new String();
		horaSaida = new String();
		escala = new Escala();
	}
	
	public Voo(String de, String destino, String localEmbarque, String portao, String diaSaida, String horaSaida){
		this.de = new String(de);
		this.destino = new String(destino);
		this.localEmbarque = new String(localEmbarque);
		this.portao = new String(portao);
		this.diaSaida = diaSaida;
		this.horaSaida = horaSaida;
	}
	
	public Voo(String de, String destino, String localEmbarque, String portao, String diaSaida, String horaSaida, Escala escala){
		this.de = new String(de);
		this.destino = new String(destino);
		this.localEmbarque = new String(localEmbarque);
		this.portao = new String(portao);
		this.diaSaida = diaSaida;
		this.horaSaida = horaSaida;
		this.escala = escala;
	}
	
	public Voo(String de, String destino, String localEmbarque, String portao, String diaSaida, String horaSaida, 
			String localEscala, String diaEscala, String horaEscala){
		this.de = new String(de);
		this.destino = new String(destino);
		this.localEmbarque = new String(localEmbarque);
		this.portao = new String(portao);
		this.diaSaida = diaSaida;
		this.horaSaida = horaSaida;
		this.escala = new Escala(localEscala, diaEscala, horaEscala);
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getLocalEmbarque() {
		return localEmbarque;
	}

	public void setLocalEmbarque(String localEmbarque) {
		this.localEmbarque = localEmbarque;
	}

	public String getDiaSaida() {
		return diaSaida;
	}

	public void setDiaSaida(String diaSaida) {
		this.diaSaida = diaSaida;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public Escala getEscala() {
		return escala;
	}

	public void setEscala(Escala escala) {
		this.escala = escala;
	}

	public String getPortao() {
		return portao;
	}

	public void setPortao(String portao) {
		this.portao = portao;
	}	
}
