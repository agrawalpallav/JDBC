package com.pall.jdbcintro.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
	public static void main(String[] agrs) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/sys";
			String username="root";
			String password = "root";
			
		 Connection connection = DriverManager.getConnection(url, username, password);
		 Statement statement = connection.createStatement();
		 String sql = "INSERT INTO e4 VALUES(105,'pallav',24,12345,'pallav@gmail.com')";
		 int count = statement.executeUpdate(sql);
		 
		 System.out.println(count);
		 connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
