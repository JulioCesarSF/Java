package br.com.fiap.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.beans.Produto;

@SuppressWarnings("serial")
@WebServlet("/cadastrar")
public class ProdutoServlet extends HttpServlet{
	
	List<Produto> p = new ArrayList<>();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String codigo = new String(req.getParameter("codigo"));
		String nome = new String(req.getParameter("nome"));
		String preco = new String(req.getParameter("preco"));
		
		p.add(new Produto(Integer.parseInt(codigo), nome, Double.parseDouble(preco)));
		
		req.setAttribute("lista", p);		
		
		req.getRequestDispatcher("sucesso.jsp").forward(req, resp);
		
	}

}
