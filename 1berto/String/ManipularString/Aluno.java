package beans;

public class Aluno {
	
	private String rm, nome, email, cpf;
	private double mensalidade;
	private char sexo;	

	public Aluno() {
		rm = new String();
		nome = new String();
		email = new String();
		cpf = new String();
	}
	
	public Aluno(String rm, String nome, String email, String cpf) {
		this.rm = new String(this.validarRM(rm));
		this.nome = new String(this.validarNome(nome));
		this.email = new String(this.validarEmail(email));
		this.cpf = new String(this.validarCpf(cpf));
	}
	
	public Aluno(String rm, String nome, String email, String cpf, double mensalidade, char sexo) {
		this.rm = new String(this.validarRM(rm));
		this.nome = new String(this.validarNome(nome));
		this.email = new String(this.validarEmail(email));
		this.cpf = new String(this.validarCpf(cpf));
		this.mensalidade = this.validarMensalidade(mensalidade);
		this.sexo = this.validarSexo(sexo);
	}
	/* getAll para retornar todos os atributos de uma vez */
	public String getAll(){
		return "Nome:\t" + nome
				+ "\nRM:\t" + rm
				+ "\nEmail:\t" + email
				+ "\nCPF:\t" + cpf
				+ "\nSexo:\t" + sexo
				+ "\nMensalidade:\t" + String.format("%,.2f", mensalidade);				
	}
	
	/* retornar todos os atributos de uma vez com concat bizonho */
	public String getAllConcat(){
		return "Nome:\t" 
	+ nome.concat(
			"\nRM:\t" + rm).concat(
					"\nEmail: \t" + rm).concat(
							"\nCPF:\t" + cpf).concat(
									"\nSexo:\t" + sexo).concat(
											"\nMensalidade:\t" + String.format("%,.2f", mensalidade));
	}
	
	/* validações private assim não dá para acessar no Main, 
	 * só usar o set dos atributos que já valida */
	
	private String validarCpf(String c){
		if(c.length() == 14)
			return c;
		return "Sem CPF";
	}
		
	private String validarEmail(String e){
		if( e.indexOf('@') != -1 )
			return e;
		return "Sem Email";
	}	
	
	private String validarNome(String n){
		if(n.length() < 2)
			return "Sem Nome";
		return n;
	}
	
	private double validarMensalidade(double valor){
		if(valor > 0.0D){
			mensalidade = valor;
			return valor;
		}
		return 0.0D;
	}
	
	/* comparar char */
	/*
	private char validarSexo(char s){
		if( s == 'm' || s == 'M')
			return 'M';
		else
			return 'F';
	}
	*/	
	
	/* converter para String para o usar o esqualsIgnoreCase */
	private char validarSexo(char s){
		if(String.valueOf(s).equalsIgnoreCase("m"))
			return 'M';
		else if(String.valueOf(s).equalsIgnoreCase("f"))
			return 'F';
		else
			return '0';
	}
	
	private String validarRM(String r){
		if(r.startsWith("RM2016"))
			return r;
		return "";
	}	

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = this.validarRM(rm);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = this.validarNome(nome);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = this.validarEmail(email);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = this.validarCpf(cpf);
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = this.validarMensalidade(mensalidade);
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = this.validarSexo(sexo);
	}
}
