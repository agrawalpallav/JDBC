package com.pall.jdbcintro.dynamicCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class TestDelete {
	public static void main(String[] args) {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			String url = "jdbc:mysql://localhost:3306/sys?user=root&password=root";
			String username="root";
			String password = "root";
			
		 Connection connection = DriverManager.getConnection(url);
		 String sql = "DELETE FROM e4 WHERE id=?";
		 PreparedStatement ps = connection.prepareStatement(sql);
		 ps.setInt(1, 105);
		 
		 int res = ps.executeUpdate();
		 System.out.println(res + " data gets updated");		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
