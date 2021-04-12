package br.com.devinhouse.tabuada;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Tabuada extends HttpServlet {

	private static final long serialVersionUID = -840684704924889282L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter writer = response.getWriter();

		writer.println("" + "<html style=\"background-color: #191622; color:#ffffff;\">" + "<body>"
				+ "<h1 style=\"text-align: center;\">Tabuada</h1>"
				+ "<table style=\"border: 1px solid white; margin: 0 auto; text-align: center;\">"
				+ "<caption style=\"border: 1px solid white; background-color: #7155d9; font-size: 20px; \"><strong>Tabuada do 1 ao 9</strong></caption>"
				+ "<tr style=\"border: 1px solid white; background-color: #7155d9;\">"
				+ "<th style=\"border: 1px solid white;\">*</th>");
		
		for (int i = 1; i < 10; i++) {
			writer.println("<th style=\"border: 1px solid white; padding: 8px; background-color: #7155d9;\">" + i + "</th>");
		}

		writer.print("</tr>");
		
		for (int i = 1; i < 10; i++) {
			if (i > 1) {
				writer.println("</tr>");
			}
			writer.println("<tr>" + "<td style=\"border: 1px solid white; padding: 12px; background-color: #7155d9;\">"
					+ i + "</td>");
			for (int e = 1; e < 10; e++) {
				writer.println("<td style=\"border: 1px solid white; padding: 8px;\">" + (e * i) + "</td>");
			}
		}

	}

}
