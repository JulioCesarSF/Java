package Beans.modelos;

public class Data {
	
	private int dia, mes, ano;
		
	public Data(){
		dia = 0;
		mes = 0;
		ano = 0;
	}
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String nomeMes(){
		if(mes == 1)
			return "Janeiro";
		else if(mes == 2)
			return "Fevereiro";
		else if(mes == 3)
			return "Março";
		else if(mes == 4)
			return "Abril";
		else if(mes == 5)
			return "Maio";
		else if(mes == 6)
			return "junho";
		else if(mes == 7)
			return "Julho";
		else if(mes == 8)
			return "Agosto";
		else if(mes == 9)
			return "Setembro";
		else if(mes == 10)
			return "Outubro";
		else if(mes == 11)
			return "Novembro";
		else 
			return "Dezembro";
	}
	
	public String retornaData(){
		return dia + "/" + mes + "/" + ano;
	}
	
	public void validarDia(){
		if(dia <= 0 || dia > 31)
			dia = 1;
	}
	
	public void validarMes(){
		if(mes <= 0 || mes > 12)
			mes = 1;
	}
	
	public void validarAno(){
		if(ano <= 0)
			ano = 2013;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
		validarDia();
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
		validarMes();
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
		validarAno();
	}
	
	

}
