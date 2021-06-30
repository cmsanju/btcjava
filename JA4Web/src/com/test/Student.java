package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Student")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String lname = request.getParameter("lname");
		
		try
		{
			//1 load the driver class
			Class.forName("com.mysql.jdbc.Driver");//oracle.jdbc.driver.OracleDriver 
			
			//2 create connection object
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "password");
			
			PreparedStatement pst = con.prepareStatement("select * from student where lastname = '"+lname+"'");
			
			
			ResultSet rst = pst.executeQuery();
			
			while(rst.next())
			{
				if(lname.equals(rst.getString(2)))
				{
					out.println("booked");
				}
				//out.println("FirstName : "+rst.getString(1)+" LastName : "+rst.getString(2)+" Age : "+rst.getInt(3));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
