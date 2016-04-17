package Beans;

public class Escala {
	
	private String local;
	private String diaEscala, horaEscala;

	public Escala() {
		local = new String();
		diaEscala = new String();
		horaEscala = new String();
	}
	
	public Escala(String local, String diaEscala, String horaEscala){
		this.local = local;
		this.diaEscala = diaEscala;
		this.horaEscala = horaEscala;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDiaEscala() {
		return diaEscala;
	}

	public void setDiaEscala(String diaEscala) {
		this.diaEscala = diaEscala;
	}

	public String getHoraEscala() {
		return horaEscala;
	}

	public void setHoraEscala(String horaEscala) {
		this.horaEscala = horaEscala;
	}
}
