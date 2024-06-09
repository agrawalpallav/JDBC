package com.pall.visitordatamanagement.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pall.visitordatamanagement.dto.Visitor;
import com.pall.visitordatamanagement.util.AppConstants;
import com.pall.visitordatamanagement.util.ConnectionUtil;

public class VisitorRepositoryImp implements VisitorRepository {
	
	public  String saveVisitor(Visitor visitor) {
		try {
			Connection connection = ConnectionUtil.getConnection(); 
		String sql = "INSERT INTO visitor(name, email, visitedDate, phone) VALUES (?,?,?,?)";
	
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,visitor.getName());
			ps.setString(2,visitor.getEmail());
			ps.setDate(3,visitor.getVisitedDate());
			ps.setString(4,visitor.getPhone());
			
			int res = ps.executeUpdate();
			connection.close();
			return AppConstants.SUCCESS_MESSAGE;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  saveVisitor(visitor);
		
		
		
	}
//	public String saveVisitor(Visitor visitor) {
//		return repository.saveVisitor(visitor);
//	}

	public String updateVisitor(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}

	public Visitor getVisitororById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Visitor getVisitororByPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	public Visitor getVisitororByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Visitor> getallVisitors() {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			connection = ConnectionUtil.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "SELECT * FROM VISITOR";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.isBeforeFirst()) {
				List<Object> list = new ArrayList<>();
				while(rs.next()) {
					Visitor visitor = new Visitor();
					visitor.setId(rs.getInt("id"));
					visitor.setName(rs.getString("name"));
					visitor.setEmail(rs.getString("email"));
					visitor.setVisitedDate(rs.getDate("visited_date"));
					visitor.setPhone(rs.getString("Pphone"));
					
					list.add(visitor);
					
				}
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public List<Visitor> getVisitorsByVisitingDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	public Visitor deleteVisitorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
