package br.com.fiap.Excecoes;

@SuppressWarnings("serial")
public class Excecoes extends Exception {

	public Excecoes(String msg) {
		super(msg);
	}

	public Excecoes(Exception e) {
		super(e);
	}

	public Excecoes(String msg, boolean stack) {
		super(msg);
		if (stack)
			print();
	}

	public Excecoes(String msg, Exception e) {
		super(msg, e);
		System.out.println(tratar(e));
	}

	public Excecoes(String msg, Exception e, boolean stack) {
		super(msg, e);

		System.out.println(tratar(e));
		if (stack)
			print();
	}

	private String tratar(Exception e) {
		if (e.getClass().toString().equals("class java.lang.NumberFormatException")) {
			return "Número inválido!";
		} else if (e.getClass().toString().equals("class java.lang.ArithmeticException")) {
			return "Divisão por 0.";
		} else if (e.getClass().toString().equals("class java.lang.ArrayIndexOutOfBoundsException"))
			return "Index maior que o vetor.";
		else
			return "Erro sem tratamento especial.";
	}

	private void print() {
		System.out.println("---- Mensagem ----");
		System.out.println(this.getMessage());
		System.out.println("StackTrace:");
		this.printStackTrace();
		System.out.println("---- Fim Mensagem ----");
	}

}