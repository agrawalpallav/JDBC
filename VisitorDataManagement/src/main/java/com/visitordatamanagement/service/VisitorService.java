package com.visitordatamanagement.service;

import java.sql.Date;
import java.util.List;

import com.pall.visitordatamanagement.dto.Visitor;

public interface VisitorService {
	public String saveVisitor(Visitor visitor);
	public String updateVisitor(Visitor visitor);
	public Visitor getVisitororById(int id);
	public Visitor getVisitororByPhone(String phone);
	public Visitor getVisitororByEmail(String email);
	public List<Visitor> getallVisitors();
	public List<Visitor> getVisitorsByVisitingDate(Date date);
	public Visitor deleteVisitorById(int id);
}
