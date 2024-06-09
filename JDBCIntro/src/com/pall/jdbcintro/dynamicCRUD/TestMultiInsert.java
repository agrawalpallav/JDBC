package com.pall.jdbcintro.dynamicCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMultiInsert {
	public static void main(String[] args) throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/sys";
			String user = "root";
			String password = "root";
			Connection connection = DriverManager.getConnection(url,user,password);
			//Statement statement = connection.createStatement();
			String query = "INSERT INTO e4 VALUES(?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);
			 ps.setInt(1, 205);
			 ps.setString(2,"Pooja");
			 ps.setInt(3, 23);
			 ps.setInt(4, 5678435);
			 ps.setString(5, "pooja2000@gmail.com");
			 ps.addBatch();
			 
			 ps.setInt(1, 90);
			 ps.setString(2,"Welvina");
			 ps.setInt(3, 23);
			 ps.setInt(4, 5678535);
			 ps.setString(5, "welvina@gmail.com");
			 ps.addBatch();
			 
			 ps.setInt(1, 100);
			 ps.setString(2,"Pushpa");
			 ps.setInt(3, 23);
			 ps.setInt(4, 5638435);
			 ps.setString(5, "pushpa@gmail.com");
			 ps.addBatch();
			 
			 int[] batch = ps.executeBatch();
				for(Integer i: batch) {
					System.out.println(i);
				}
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
