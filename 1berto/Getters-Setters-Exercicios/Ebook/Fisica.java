package descansos.Ebook;

public class Fisica extends Cliente{
	
	private static int cpf, rg;
	private static String sexo;	
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		Fisica.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		Fisica.rg = rg;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		Fisica.sexo = sexo;
	}
	
	public String getAll(){
		return "Nome: " + this.getNome() + "\n" 
				+ "Endereco: " + this.getEndereco() + "\n"
				+ "Email: " + this.getEmail() + "\n"
				+ "Sexo: " + sexo + "\n"
				+ "CPF: " + Fisica.cpf + "\n"
				+ "RG: " + Fisica.rg + "\n"
				+ "Telefone: " + this.getTelefone();
	
	}

}
