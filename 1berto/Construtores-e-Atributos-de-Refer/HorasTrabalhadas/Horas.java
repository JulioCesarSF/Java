
import javax.swing.JOptionPane;

public class Horas {
	
	private int horas;
	private double valorHora;	
	
	public Horas() {}	

	public Horas(int horas, double valorHora) {
		this.horas = horas;
		this.valorHora = valorHora;
	}
	
	public String perguntar(String msg){
		return JOptionPane.showInputDialog(msg);
	}
	
	public void calcHoras(){
		this.horas = Integer.parseInt(this.perguntar("Horas trabalhadas"));
		this.valorHora = Double.parseDouble(this.perguntar("Valor da hora de trabalho"));
		
		double salario = this.horas * this.valorHora;
		
		System.out.println(
				"Horas: " + this.horas + " Valor Hora R$: " + this.valorHora
				+ "\nSalário: R$" + String.format("%.2f",salario));
	}
	
	public double calcHoras(int horas, double valorHora){
		return horas * valorHora;
	}
	
	public double calcHoras(double horas, double valorHora){
		return horas * valorHora;
	}
	
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	

}
