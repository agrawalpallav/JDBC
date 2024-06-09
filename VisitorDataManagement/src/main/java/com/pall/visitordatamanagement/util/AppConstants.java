package com.pall.visitordatamanagement.util;

public interface AppConstants {
	String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	String URL = "jdbc:mysql://localhost:3306/visitor_data_management";
	String USER_NAME = "root";
	String PASSWORD = "root";
	String SUCCESS_MESSAGE = "Operation Sucessful";
	String ERROR_MESSAGE = "Something went wrong";
	String VISITOR_INSERT_QUERY= "INSERT INTO VISITOR(name,email,visited_date, phone) VALUES(?,?,?,?)";
}
