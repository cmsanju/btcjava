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


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String userMail = request.getParameter("email");
		String pass = request.getParameter("pwd");
		
		out.println("user email : "+userMail);
		
		//Cookie ck = new Cookie("info", userMail);
		
		//response.addCookie(ck);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("info", userMail);
		
		
			out.println("<br><a href = 'Servlet1'>successfully logged in go to next</a>");
		
	}

}
