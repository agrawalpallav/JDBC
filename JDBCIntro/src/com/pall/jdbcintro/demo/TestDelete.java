package com.pall.jdbcintro.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/sys";
			String username="root";
			String password = "root";
			
		 Connection connection = DriverManager.getConnection(url, username, password);
		 Statement statement = connection.createStatement();
		 String sql = "DELETE FROM e4  WHERE "+"id=103";
		 
		 int res = statement.executeUpdate(sql);
		 System.out.println(res);
		 connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
