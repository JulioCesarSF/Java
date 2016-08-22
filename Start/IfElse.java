public class IfElse {
	
	private int numero;
	
	/*
	 * IF ELSE realizar a verificação de uma expressão/condição
	 * Faz a mesma coisa do SE SENAO FIMSE do VisualG 
	 * */
	
	public boolean numeroMaior(int numero1, int numero2){
		if(numero1 > numero2){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String numeroMaior(int numero){
		if(numero > 1000){
			return "Maior que 1000";
		}
		else{
			if(numero >= 500){
				return "Maior ou igual que 500";
			}
			else{
				return "Menor que 500";
			}
		}			
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}	

}
