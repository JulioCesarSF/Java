package br.com.fiap.Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Arquivo {

	public static String procurarExcecao(String excecao) throws Exception {
		FileReader fR = new FileReader(System.getProperty("user.dir") + "/excecoes/excecoes.txt");
		BufferedReader bF = new BufferedReader(fR);

		String tratamento = new String();

		while (bF.ready()) {
			String linha = new String(bF.readLine());
			if (linha.indexOf(excecao) == -1)
				continue;
			
			if(linha.indexOf("\"") == -1)
				tratamento = linha;
			else
				tratamento = linha.substring(linha.indexOf("\""), linha.length());
			
			break;
		}

		bF.close();
		fR.close();

		return tratamento;
	}

	public static void novaExcecao(String excecao) throws Exception {
		FileWriter fW = new FileWriter(System.getProperty("user.dir") + "/excecoes/excecoes.txt", true);
		PrintWriter pW = new PrintWriter(fW);
		pW.println();
		pW.print(excecao);
		pW.close();
		fW.close();
	}

}
