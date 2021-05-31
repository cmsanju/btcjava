package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String userMail = request.getParameter("email");
		String pass = request.getParameter("pwd");
		
		
		if(userMail.equals("admin") && pass.equals("admin"))
		{
			out.println("login success...");
		}
		else
		{
			out.println("login failed...");
		}
	}

}
