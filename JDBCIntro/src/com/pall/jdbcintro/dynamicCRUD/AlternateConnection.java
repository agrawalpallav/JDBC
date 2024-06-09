package com.pall.jdbcintro.dynamicCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class AlternateConnection {
	public static void main(String[] args) throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/sys";
			
			Properties properties = new Properties();
			properties.setProperty("user","root");
			properties.setProperty("password", "root");
			
			Connection connection = DriverManager.getConnection(url,properties);
			System.out.println("connected");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
