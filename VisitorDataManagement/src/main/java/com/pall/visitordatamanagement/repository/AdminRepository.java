package com.pall.visitordatamanagement.repository;

import com.pall.visitordatamanagement.dto.Admin;

public interface AdminRepository {
	public String saveAdmin(Admin admin);
	public Admin adminLogin(String userName, String password);

}
