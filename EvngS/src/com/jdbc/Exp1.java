package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exp1 {
	
	public static void main(String[] args) throws Exception
	{
		
		//1 load the driver class
		Class.forName("com.mysql.jdbc.Driver");//oracle.jdbc.driver.OracleDriver
		
		//2 create connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "password");
		
		con.setAutoCommit(false);
		
		//3 create the statement object
		Statement stmt = con.createStatement();
		
		//4 execute the query
		//stmt.execute("create table evengBt(id int, name varchar(50), city varchar(50))");
		
		//stmt.execute("insert into evengbt values(3, 'rAVI', 'pgnr')");
		
		//stmt.execute("update evengbt set name = 'Ravi' where id = 3");
		
		//stmt.execute("delete from evengbt where id = 2");
		
		stmt.addBatch("insert into evengbt values(2, 'Akhil', 'MPL')");
		stmt.addBatch("insert into evengbt values(4, 'mOUNIKA', 'MPL')");
		stmt.addBatch("insert into evengbt values(5, 'HITESH', 'KADAPA')");
		stmt.addBatch("update evengbt set name = 'Mounica' where id = 4");
		
		stmt.executeBatch();
		
		//con.commit();
		con.rollback();
		
		ResultSet rs = stmt.executeQuery("select * from evengbt");
		
		while(rs.next())
		{
			System.out.println("ID : "+rs.getInt(1)+" Name : "+rs.getString(2)+" City : "+rs.getString(3));
		}
		
		//5 close the connection object
		con.close();
		
		System.out.println("Done.");
	}

}
