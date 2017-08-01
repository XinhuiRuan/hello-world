package com.red.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dao.UserDao;
import com.dao.Imp.UserDaoImp;
import com.opensymphony.xwork2.ActionSupport;
import com.user.user;

public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String user_name;
	private String user_password;
	HttpServletRequest request = ServletActionContext.getRequest();
	
	public String addUser() throws Exception{
		UserDao dao = new UserDaoImp();
		user u = new user();
		u.setUser_name(getUser_name());
		u.setUser_password(getUser_password());
		dao.adduser(u);
		//request.setAttribute("tipMessage","Add Success!");
		return "add_success";
		
		
	}
	
	public String showAllUser() throws Exception{
		List<user> list = new ArrayList<user>();
		UserDao dao = new UserDaoImp();
		list = dao.queryAllUser();
		request.setAttribute("list",list);
		
		return "query_success";
	}
	
	public String deleteUser() throws Exception{
		UserDao dao = new UserDaoImp();
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		dao.deleteUser(user_id);
		
		return "delete_success";
	}
	
	public String updateUser() throws Exception{
		UserDao dao = new UserDaoImp();
		user u = new user();
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		u.setUser_id(user_id);
		u.setUser_name(getUser_name());
		u.setUser_password(getUser_password());
		dao.updateUser(u);
		
		return "update_success";
	}
	
	public String queryUserById() throws Exception{
		int user_id = Integer.parseInt(request.getParameter("user_id")); //获得页面传递的user_id
		user u = new user();
		UserDao dao = new UserDaoImp();
		u = dao.queryUserById(user_id);
		request.setAttribute("u", u);
		
		return "queryUserById_success";
	}
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	

}
