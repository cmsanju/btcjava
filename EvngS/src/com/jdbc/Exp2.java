package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exp2 {
	
	public static void main(String[] args) throws Exception
	{
		
		//1 load the driver class
	    Class.forName("com.mysql.jdbc.Driver");//oracle.jdbc.driver.OracleDriver
				
		//2 create connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "password");
				
		con.setAutoCommit(false);
				
		//3 create the statement object
		PreparedStatement pst = con.prepareStatement("insert into evengbt values(?,?,?)");
		
		pst.setInt(1, 7);
		pst.setString(2, "Mango");
		pst.setString(3, "AP");
		
		pst.execute();
		
		PreparedStatement pst1 = con.prepareStatement("select * from evengbt");
		
		ResultSet rs = pst1.executeQuery();
		
		while(rs.next())
		{
			System.out.println("ID : "+rs.getInt(1)+" Name : "+rs.getString(2)+" City : "+rs.getString(3));
		}
		
		
	}

}
