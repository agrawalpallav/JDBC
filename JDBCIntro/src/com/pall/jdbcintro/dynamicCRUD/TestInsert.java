package com.pall.jdbcintro.dynamicCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TestInsert {
	public static void main(String[] args) {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			String url = "jdbc:mysql://localhost:3306/sys?user=root&password=root";
//			String username="root";
//			String password = "root";
			
		 Connection connection = DriverManager.getConnection(url);
		 String sql = "INSERT INTO e4 VALUES(?,?,?,?,?)";
		 
		 PreparedStatement ps = connection.prepareStatement(sql);
		 ps.setInt(1, 205);
		 ps.setString(2,"Pooja");
		 ps.setInt(3, 23);
		 ps.setInt(4, 5678435);
		 ps.setString(5, "pooja2000@gmail.com");
		   
		 int res = ps.executeUpdate();
		 connection.close();		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
