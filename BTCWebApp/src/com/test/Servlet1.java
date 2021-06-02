package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		//Cookie[] ck = request.getCookies();
		
		//out.println("<h3> From servlt1 : "+ck[0].getValue()+"</h3>");
		
		HttpSession session = request.getSession();
		
		String user = (String)session.getAttribute("info");
		
		out.println("<h3> From servlt1 : "+user+"</h3>");
	}

}
