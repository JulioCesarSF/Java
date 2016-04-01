package descanso8.Mod;

import java.util.ArrayList;

public class Carro {
	
	private String modelo, fabricante;
	private int anoFabricacao;
	private Cor cor;
	private double valor;	
	
	private ArrayList<Acessorio> acessorios = new ArrayList<Acessorio>();		
	
	public Carro() {}
	
	public Carro(String modelo, String fabricante, int anoFabricacao, Cor cor, double valor,
			ArrayList<Acessorio> acessorios) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
		this.valor = valor;
		this.acessorios = acessorios;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public void addAcessorio(String nome, boolean possui, double valor){
		for(int i =0; i < acessorios.size(); i++){
			if(acessorios.get(i).getNome() == nome)
				return;					
		}		
		Acessorio a = new Acessorio();
		a.setNome(nome);
		a.setPossui(possui);
		a.setValor(valor);
		acessorios.add(a);
	}
	
	public void delAcessorio(String nome){
		if(acessorios.size() == 0)
			return;
		for(int i = 0; i < acessorios.size(); i++){
			if(acessorios.get(i).getNome() == nome){
				acessorios.remove(i);
				break;
			}				
		}
		
	}
	
	public void atualizarAcessorios(String nome, boolean possui){
		if(acessorios.size() == 0)
			return;
		for(int i = 0; i < acessorios.size(); i++){
			if(acessorios.get(i).getNome() == nome){
				acessorios.get(i).setPossui(possui);				
				break;
			}				
		}
	}
	
	public void atualizarAcessorios(String nome, boolean possui, double valor){
		if(acessorios.size() == 0)
			return;
		for(int i = 0; i < acessorios.size(); i++){
			if(acessorios.get(i).getNome() == nome){
				acessorios.get(i).setPossui(possui);
				if(valor != 0.0d)
					acessorios.get(i).setValor(valor);
				break;
			}				
		}
	}
	
	public void exibirOpcionais(){
		if(acessorios.size() == 0)
			System.out.println("\n\nNenhum opcional");
		else{
			System.out.println("\n\nAcessórios: ");
			double total = 0.0d;
			for(int i = 0; i < acessorios.size(); i++){
				System.out.print(acessorios.get(i).getNome());
				if(acessorios.get(i).isPossui()){
					System.out.print(" Possui: sim");
					total += acessorios.get(i).getValor();
				}
				else
					System.out.print(" Possui: nao");
				System.out.print(" Valor: R$" + acessorios.get(i).getValor() + "\n");				
			}
			System.out.println("Total do valor de acessórios: R$ " + total);
		}
	}
	
	public double calcValorAcessorios(){
		double total = 0.0f;
		if(acessorios.size() == 0)
			return .0f;
		for(int i =0; i < acessorios.size(); i++){
			if(acessorios.get(i).isPossui())
				total += acessorios.get(i).getValor();
		}
		return total;
	}
	
	public void exibirValores(){
		System.out.println( "\nValores: "
				+ "\nValor do carro sem acessórios: R$" + this.valor
				+ "\nValor do carro com acessórios:  R$" + (this.valor + this.calcValorAcessorios())
				+ "\nIPI: R$ " + this.getIPI() 
				+ "\nICMS: R$ " + this.getICMS() 
				+ "\nTOTAL: R$" + ((this.valor + this.calcValorAcessorios()) + this.getIPI() + this.getICMS()));
	}
	
	public void exibirTudo(){
		System.out.println("Dados do veículo: \n"
				+ "Fabricante: " + this.fabricante + " - Modelo: " + this.modelo + " - Ano: " + this.anoFabricacao);
		cor.exibir();
		this.exibirOpcionais();
		this.exibirValores();
	}
	
	public double getIPI(){
		return this.valor*(7.5/100);
	}
	
	public double getICMS(){
		return this.valor*(6.0/100);
	}
	
	public double getImpostos(){
		return this.getIPI() + this.getICMS();
	}

}
