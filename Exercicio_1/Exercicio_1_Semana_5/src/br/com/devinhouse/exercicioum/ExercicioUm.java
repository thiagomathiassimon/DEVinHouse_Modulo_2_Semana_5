package br.com.devinhouse.exercicioum;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class ExercicioUm extends HttpServlet {

	private static final long serialVersionUID = -840684704924889282L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String title = "Servlet Example: Showing Request Headers";

		String requestMethod = "<strong>Request Method: </strong>" + request.getMethod();
		String url = "<strong>Request URL: </strong>" + request.getRequestURL();
		String uri = "<strong>Request URI: </strong>" + request.getRequestURI();
		String protocol = "<strong>Request Protocol: </strong>" + request.getProtocol();

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		writer.println("<html>");
		writer.println("<body style=\"background-color: #191622; color:#ffffff;\">\n");
		writer.println("<h1 style=\"text-align: center;\">" + title + "</h1>");
		writer.println("<p>");
		writer.println(requestMethod);
		writer.println("<br/>" + url);
		writer.println("<br/>" + uri);
		writer.println("<br/>" + protocol);
		writer.println("</p>");
		writer.println("<br/>");
		writer.println("<table  BORDER=1 ALIGN=CENTER>");
		writer.println("<tr style=\"background-color:#7155d9; font-size: 24px;\">");
		writer.println("<TH>Header Name<TH>Header Value");

		Enumeration headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			writer.println("<tr><td>" + headerName);
			writer.println("    <td>" + request.getHeader(headerName));
		}
		
		writer.println("</table>");
		writer.println("</body>");
		writer.println("</html>");
	}

}