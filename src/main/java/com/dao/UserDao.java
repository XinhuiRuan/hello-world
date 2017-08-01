package com.dao;

import java.util.List;

import com.user.user;

public interface UserDao {
	public void adduser(user u);
	public List<user> queryAllUser();
	public user queryUserById(int id);
	public void updateUser(user u);
	public void deleteUser(int id);
	public user validateUser(String username,String password);
}
