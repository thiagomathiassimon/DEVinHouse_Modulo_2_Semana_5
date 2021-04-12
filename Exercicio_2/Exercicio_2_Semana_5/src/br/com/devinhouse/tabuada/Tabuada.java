package br.com.devinhouse.tabuada;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.websocket.server.PathParam;

public class Tabuada extends HttpServlet{

	private static final long serialVersionUID = -840684704924889282L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int parametro = Integer.parseInt(request.getParameter("valor"));
		
		PrintWriter writer = response.getWriter();
		
		writer.println(""
				+ "<html style=\"background-color: #191622; color:#ffffff;\">"
				+ "<body>"
				+ "<h1>Tabuada do " + parametro
				+ "<p>");
		
		for (int i = 0; i < 11; i++) {
			writer.println(i + " X " + parametro + " = " + (i * parametro) + "<br/>");
		}
		
		writer.println(""
				+ "</p>"
				+ "</body>"
				+ "<html>");
	}
	
}
