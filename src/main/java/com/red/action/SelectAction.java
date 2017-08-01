package com.red.action;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.SelectDao;
import com.dao.UserDao;
import com.dao.Imp.SelectDaoImp;
import com.dao.Imp.UserDaoImp;
import com.hibernate.HibernateUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.problem.problem;
import com.user.user;

public class SelectAction extends ActionSupport{
	
	/**
	 * 
	 */
	private Set<problem> problemList;
	private int user_id;
	private static final long serialVersionUID = 1L;
	HttpServletRequest request = ServletActionContext.getRequest(); 

	public String selectProblem() throws Exception{
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int user_id = (Integer) ActionContext.getContext().getSession().get("user_id");
		user u = s.get(user.class, user_id);
		Set<problem> problems = u.getProblems();
		tx.commit();
		this.setProblemList(problems);
		
		return "problem_success";
	}

	
	public Set<problem> getProblemList() {
		return problemList;
	}

	public void setProblemList(Set<problem> problemList) {
		this.problemList = problemList;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	
}
