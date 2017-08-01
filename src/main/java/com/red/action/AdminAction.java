package com.red.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admin.admin;
import com.dao.AdminDao;
import com.dao.UserDao;
import com.dao.Imp.AdminDaoImp;
import com.dao.Imp.UserDaoImp;
import com.hibernate.HibernateUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.user.user;

public class AdminAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int admin_id;
	private String admin_name;
	private String admin_password;
	private int user_id;
	private String user_name;
	private String user_password;
	HttpServletRequest request = ServletActionContext.getRequest();
	
	public String adminRegister() throws Exception{
		admin ad = new admin();
		AdminDao dao = new AdminDaoImp();
		ad.setAdmin_name(getAdmin_name());
		ad.setAdmin_password(getAdmin_password());
		dao.adminRegister(ad);
		return "register_success";
	}
	
	public String adminLogin() throws Exception{
		boolean validated = false;
		AdminDao dao = new AdminDaoImp();
		admin ad = dao.validateAdmin(getAdmin_name(), getAdmin_password());
		admin_id = ad.getAdmin_id();
		if(ad != null){
			validated = true;
		}
		if(validated){
			ActionContext.getContext().getSession().put("admin_id", getAdmin_id());
			ActionContext.getContext().getSession().put("admin_name", getAdmin_name());
			
			return "login_success";
		}
		else{
			return "login_error";
		}
		
	}
	
	public String showAdminPage() throws Exception{
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int admin_id = (Integer) ActionContext.getContext().getSession().get("admin_id");
		admin ad = s.get(admin.class, admin_id);
		tx.commit();
		//request.setAttribute("ad", ad);
		return "showAdminPage_success";
	}
	
	public String showOwnInfo() throws Exception{
		int admin_id = (Integer) ActionContext.getContext().getSession().get("admin_id");
		admin ad = new admin();
		AdminDao dao = new AdminDaoImp();
		ad = dao.showOwnInfo(admin_id);
		request.setAttribute("ad", ad);
		return "showOwnInfo_success";
	}
	
	public String queryOwnAdmin() throws Exception{
		int admin_id = (Integer) ActionContext.getContext().getSession().get("admin_id"); //获得页面传递的user_id
		admin ad = new admin();
		AdminDao dao = new AdminDaoImp();
		ad = dao.showOwnInfo(admin_id);
		request.setAttribute("ad", ad);
		return "queryOwnAdmin_success";
	}
	
	public String updateOwnAdmin() throws Exception{
		admin ad = new admin();
		AdminDao dao = new AdminDaoImp();
		int admin_id = (Integer) ActionContext.getContext().getSession().get("admin_id");
		ad.setAdmin_id(admin_id);
		ad.setAdmin_name(admin_name);
		ad.setAdmin_password(admin_password);
		dao.updateOwnAdmin(ad);
		return "updateOwnAdmin_success";
	}
	
	public String deleteOwnAdmin() throws Exception{
		AdminDao dao = new AdminDaoImp();
		int admin_id = (Integer) ActionContext.getContext().getSession().get("admin_id");
		dao.deleteOwnAdmin(admin_id);
		return "deleteOwnAdmin_success";
	}
	
	public String showAllUser() throws Exception{
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		List<user> list = new ArrayList<user>();
		AdminDao dao = new AdminDaoImp();
		admin ad = s.get(admin.class, getAdmin_id());
		list = dao.queryAllUser();
		request.setAttribute("ad", ad);
		request.setAttribute("list",list);	
		return "queryUser_success";
	}
	
	public String queryUserById() throws Exception{
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int user_id = Integer.parseInt(request.getParameter("user_id")); //获得页面传递的user_id
		int admin_id = (Integer) ActionContext.getContext().getSession().get("admin_id");
		admin ad = s.get(admin.class, admin_id);
		user u = new user();
		AdminDao dao = new AdminDaoImp();
		u = dao.queryUserById(user_id);
		request.setAttribute("u", u);
		request.setAttribute("ad", ad);
		return "queryUserById_success";
	}
	
	public String updateUser() throws Exception{
		AdminDao dao = new AdminDaoImp();
		user u = new user();
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		//int admin_id = Integer.parseInt(request.getParameter("admin_id"));
		u.setUser_id(user_id);
		u.setUser_name(getUser_name());
		u.setUser_password(getUser_password());
		dao.updateUser(u);
		
		return "updateUser_success";
	}
	
	public String deleteUser() throws Exception{
		AdminDao dao = new AdminDaoImp();
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		dao.deleteUser(user_id);
		
		return "deleteUser_success";
	}
	
	public String showAllProblem() throws Exception{
		List<user> list = new ArrayList<user>();
		UserDao dao = new UserDaoImp();
		list = dao.queryAllUser();
		request.setAttribute("list",list);	
		return "queryProblem_success";
	}
	
	
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
