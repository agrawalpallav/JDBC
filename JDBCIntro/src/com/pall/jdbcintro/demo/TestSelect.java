package com.pall.jdbcintro.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TestSelect {
	public static void main(String[] args){
		try {
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.cj.jdbc.Driver");  
			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://localhost:3306/sys";
			String username="root";
			String password = "root";
			
		 Connection connection = DriverManager.getConnection(url, username, password);
		 Statement statement = connection.createStatement();
		 String sql = "SELECT * FROM e4";
		 boolean res = statement.execute(sql);
		 ResultSet rs = statement.getResultSet();
		 
		 while(rs.next()) {
			 System.out.println(rs.getInt(1));
			 System.out.println(rs.getString(2));  
			 System.out.println(rs.getObject(3));
			 System.out.println(rs.getObject(4));
			 System.out.println(rs.getObject(5));
			 System.out.println("------------");
		 }
		 System.out.println(rs);
		 connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
