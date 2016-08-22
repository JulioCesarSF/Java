package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ValidarServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String n1 = new String(req.getParameter("n1"));
		 String n2 = new String(req.getParameter("n2"));
		 String op = new String(req.getParameter("operacao"));
		 
		 if(n1.equals(""))
			 n1 = "0";
		 if(n2.equals(""))
			 n2 = "0";
		 
		 int total = 0;
		 
		 if(op.equals("+"))
			 total = Integer.parseInt(n1) + Integer.parseInt(n2);
		 else if(op.equals("-"))
			 total = Integer.parseInt(n1) - Integer.parseInt(n2);
		 else if(op.equals("*"))
			 total = Integer.parseInt(n1) * Integer.parseInt(n2);
		 else
			 total = Integer.parseInt(n1) / Integer.parseInt(n2);
		 
		 System.out.println("Resultado: " + total );
	}

}
