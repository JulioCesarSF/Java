package br.com.fiap.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/logar")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String u = new String(req.getParameter("usuario"));
		String s = new String(req.getParameter("senha"));
		
		if(u.equals("FIAP") && s.equals("2016")){
			out.print("<html><body><h1>Logado como " + u + "</h1></body></html>");
		}else{
			out.print("<html><body><h1>Não logado!</h1></body></html>");
		}
	}

}
