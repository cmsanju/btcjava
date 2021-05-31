package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email");
		
		String pass = request.getParameter("pwd");
		
		if(email.equals("admin") && pass.equals("admin"))
		{
			//out.println("login success");
			
			//RequestDispatcher rd = request.getRequestDispatcher("home.html");
			//rd.forward(request, response);
			response.sendRedirect("https://www.google.com/");
		}
		else
		{
			out.println("<font color = 'red'>login failed.</font>");
			
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
	}

}
