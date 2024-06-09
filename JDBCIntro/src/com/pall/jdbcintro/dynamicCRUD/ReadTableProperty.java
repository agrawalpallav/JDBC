package com.pall.jdbcintro.dynamicCRUD;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class ReadTableProperty {
	public static void main(String[] args) throws IOException, SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/sys";
			FileInputStream fis = new FileInputStream("mydbinfo.properties");
			
			Properties properties = new Properties();
			properties.load(fis);
			
			Connection connection = DriverManager.getConnection(url,properties);
			System.out.println("connected");
			String sql = "SELECT * FROM e4";
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			boolean next = rs.isBeforeFirst();
			java.sql.ResultSetMetaData metaData = rs.getMetaData();
			int count = metaData.getColumnCount();
			System.out.println(next);
			while(rs.next()) {
				for(int i=1; i<=count; i++) {
					System.out.println(metaData.getColumnName(i)+ " data for table is " + rs.getObject(i));
				}
				System.out.println();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
