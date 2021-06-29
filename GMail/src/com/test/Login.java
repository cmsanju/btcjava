package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
			
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("email");
		
		String pass = request.getParameter("pwd");
		
		Statement stmt = DBConnect.getConnect().createStatement();
		
		String sql = "select * from evnguser";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next())
		{
		
		out.println("<br>First Name : "+rs.getString(1)+" Email : "+rs.getString(2)+" Password : "+rs.getString(3));
		
		}
		/*
		if(user.equals("admin") && pass.equals("admin"))
		{
			//RequestDispatcher rd = request.getRequestDispatcher("home.html");
			
			//rd.forward(request, response);
			
			response.sendRedirect("https://www.google.com/");
		}
		else
		{
			out.println("<font color = 'red'>login failed...!!!</font>");
			
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			
			rd.include(request, response);
		}
		*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
