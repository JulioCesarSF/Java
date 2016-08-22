package br.com.fiap.excecoes;

@SuppressWarnings("serial")
public class Excecoes extends Exception {

	private String erro;

	public Excecoes(String erro, boolean stackTrace) {
		super();

		this.erro = new String(erro);

		this.getErro();

		this.print();
	}

	public Excecoes(Exception e, boolean stackTrace) {
		super();

		this.erro = new String("");

		this.getErro(e);

		this.print();

		if (stackTrace)
			e.printStackTrace();
	}

	public Excecoes(String erro, Exception e, boolean stackTrace) {
		super();

		this.erro = new String(erro);

		this.getErro(e);

		this.print();

		if (stackTrace)
			e.printStackTrace();
	}

	private void getErro() {
		erro += "\t" + this.getMessage();
	}

	private void getErro(Exception e) {

		if (e.getClass().toString().equals("class java.lang.ArithmeticException")) {
			erro += " ArithmeticException, ";
		} else if (e.getClass().toString().equals("class java.lang.ArrayIndexOutOfBoundsException")) {
			erro += " ArrayIndexOutOfBoundsException, ";
		} else if (e.getClass().toString().equals("class java.lang.NullPointerException")) {
			erro += " NullPointerException, ";
		} else if (e.getClass().toString().equals("class java.lang.NumberFormatException")) {
			erro += " NumberFormatException, ";
		} else {
			if (e.getMessage() == null || e.getCause() == null || !erro.equals(""))
				return;
			else
				erro += " Erro sem tratamento, " + e.getMessage();
		}

	}

	@Override
	public String toString() {
		return erro;
	}

	public String print() {
		return this.toString();
	}

}
