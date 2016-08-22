package br.com.fiap.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/buscaAluno")
public class AlunoServlet extends HttpServlet {
	
	List<String> nome = new ArrayList<String>(){
		{
			add("Julio0");
			add("Julio1");
			add("Julio2");
			add("Julio3");
			add("Julio4");
		}
		};
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter p = resp.getWriter();
		
		String sAluno = new String(req.getParameter("nome"));		
		
		if(nome.contains(sAluno))
			sAluno+= "\n <h2>Nome encontrado!</h2>";
		else
			sAluno+= "\n <h2>Nome NÃO encontrado!</h2>";
		
		System.out.println("Nome do Aluno:\t" + sAluno);
		
		p.write("<html><body><p>" + sAluno + "</p></body></html>");
		
	}

}
