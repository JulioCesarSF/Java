package br.com.fiap.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MediaServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter p = resp.getWriter();
		
		double ps = Double.parseDouble(req.getParameter("ps"));
		double nac = Double.parseDouble(req.getParameter("nac"));
		double am = Double.parseDouble(req.getParameter("am"));
		
		double media = (ps*0.5) + (nac*0.2) + (am*0.3);
		
		System.out.println("Média:" + media);
		
		String a = new String("<html><body><p>");
		String b = new String("</p></body></html>");
		String status = new String("Status:");
		
		if(media >= 5.5 && media < 6)
			status+="Exame Nota:";
		else if(media >= 6)
			status+="Aprovado Nota:";
		else
			status+="Reprovado Nota:";
		
		p.write(a + status + media + b);
		
	}
}
