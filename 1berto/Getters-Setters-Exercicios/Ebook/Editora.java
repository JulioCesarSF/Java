package descansos.Ebook;

public class Editora {
	
	private String razaoSocial, cpnj, endereco;
	
	

	public Editora() {
	}

	public Editora(String razaoSocial, String cpnj, String endereco) {
		this.razaoSocial = razaoSocial;
		this.cpnj = cpnj;
		this.endereco = endereco;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCpnj() {
		return cpnj;
	}

	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getAll(){
		return "Editora:\n"
				+ "Razão Social: " + this.razaoSocial + "\n" 
				+ "CNPJ: " + this.cpnj + "\n"
				+ "Endereco: " + this.endereco;
	}

}
