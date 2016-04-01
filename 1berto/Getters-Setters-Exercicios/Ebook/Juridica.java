package descansos.Ebook;

public class Juridica extends Cliente {
	
	private static int cnpj;
	private static String incricaoEstadual;
	private static Contato contato;	
	
	public Juridica(){
		Contato pJContato = new Contato();
		Juridica.contato = pJContato;
	}
	
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		Juridica.cnpj = cnpj;
	}
	public String getIncricaoEstadual() {
		return incricaoEstadual;
	}
	public void setIncricaoEstadual(String incricaoEstadual) {
		Juridica.incricaoEstadual = incricaoEstadual;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		Juridica.contato = contato;
	}
	
	public void setContatoNome(String nome){
		Juridica.contato.setNome(nome);
	}
	
	public void setContatoTelefone(String telefone){
		Juridica.contato.setTelefone(telefone);
	}
	
	public String getAll(){
		return "Nome: " + this.getNome() + "\n" 
				+ "Endereco: " + this.getEndereco() + "\n"
				+ "Email: " + this.getEmail() + "\n"
				+ "CNPJ: " + Juridica.cnpj + "\n"
				+ "Inscrição Estadual: " + Juridica.incricaoEstadual + "\n"
				+ "Telefone: " + this.getTelefone() + "\n"
				+ "Contato: \n" 
				+ "- Nome: " + Juridica.contato.getNome() + "\n"
				+ "- Telefone: " + Juridica.contato.getTelefone();
	}

}
