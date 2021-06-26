package com.test;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("email");
		
		String pass = request.getParameter("pwd");
		
		//Cookie ck = new Cookie("info", user);
		
		//response.addCookie(ck);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("info", user);
		
		out.println("User From login "+user);
		
		out.println("<br><a href = 'Servlet2'> got to next</a>");

	}

}
