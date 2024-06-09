package com.pall.jdbcintro.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestBatchExecution {
	public static void main(String[] args) throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/sys";
			String user = "root";
			String password = "root";
			Connection connection = DriverManager.getConnection(url,user,password);
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO e4 VALUES (404,'NIRMAL',30,23435,'NIREOFJN@GMAIL.COM')";
			String update  = "UPDATE e4 SET name = 'legain' where name = 'ABCD'";
			statement.addBatch(sql);
			statement.addBatch(update);
			int[] batch = statement.executeBatch();
			for(Integer a: batch) {
				System.out.println(a);
			}
				
			//connection.close();
			//boolean res = staement.execute(sql);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
