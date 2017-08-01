package com.dao;

import java.util.List;

import com.admin.admin;
import com.user.user;

public interface AdminDao {
	public void adminRegister(admin ad);
	public admin validateAdmin(String admin_name, String admin_password);
	public admin showOwnInfo(int id);
	public void updateOwnAdmin(admin ad);
	public void deleteOwnAdmin(int id);
	
	public List<user> queryAllUser();
	public user queryUserById(int id);
	public void updateUser(user u);
	public void deleteUser(int id);
}
