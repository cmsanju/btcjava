package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ListenerServlet")
public class ListenerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("email");
		
		String pass = request.getParameter("pwd");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("info", user);
		
		ServletContext ctx = getServletContext();
		
		int total = (int)ctx.getAttribute("totalusers");
		int current = (int)ctx.getAttribute("currentusers");
		
		out.println("<h3> User Name : "+user+"</h3>");
		
		out.println("<h3> Total Users : "+total+"</h3>");
		out.println("<h3> Current Users :"+current+"</h3> ");
		
		out.println("<a href = 'Logout'> logout here </a>");
		
		
	}

}
