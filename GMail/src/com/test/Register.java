package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("fname");
		
		String user = request.getParameter("email");
		
		String pass = request.getParameter("pwd");
		
		if(pass.contains("admin"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			
			rd.forward(request, response);
		}
		else
		{
			out.println("<font color = 'red'>Faile and please try again</font>");
			
			RequestDispatcher rd = request.getRequestDispatcher("register.html");
			rd.include(request, response);
		}
		
	}

}
