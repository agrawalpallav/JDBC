package com.pall.visitordatamanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName(AppConstants.DRIVER_NAME);
			return DriverManager.getConnection(AppConstants.URL,AppConstants.USER_NAME, AppConstants.PASSWORD);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
