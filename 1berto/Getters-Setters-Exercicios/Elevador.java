public class Elevador {
	
	private int andar, totalAndares, capMaxima, pessoasAgora;
	
	public Elevador(){}
	
	public Elevador(int andar, int totalAndares, int capMaxima, int pessoasAgora){
		this.andar = andar;
		this.totalAndares = totalAndares;
		this.capMaxima = capMaxima;
		this.pessoasAgora = pessoasAgora;
	}
	
	public void inicializa(int capMaxima, int totalAndares){
		this.capMaxima = capMaxima;
		this.totalAndares = totalAndares;
	}
	
	public void entra(int qntPessoa){		
		if( (this.pessoasAgora + qntPessoa) <= this.capMaxima ){
			this.pessoasAgora += qntPessoa;
		}
		else{
			int pessoasDeFora = (this.pessoasAgora + qntPessoa) - this.capMaxima;
			this.pessoasAgora = (this.pessoasAgora + qntPessoa) - pessoasDeFora;	
		}
	}
	
	public void sai(int qntPessoa){		
		if( (this.pessoasAgora - qntPessoa) >= 0 ){
			this.pessoasAgora -= qntPessoa;
		}
		else{
			this.pessoasAgora = 0;		
		}
	}
	
	public void sobe(){
		if(andar != this.totalAndares)
			andar += 1;		
	}
	
	public void desce(){
		if(andar != 0) /* exclui térreo */
			andar -= 1;
	}
	
	public String getAll(){
		return "Andar: " + this.andar + " / " + this.totalAndares + "\n"
				+ "Pessoas: " + this.pessoasAgora + " / " + this.capMaxima;
	}

}
