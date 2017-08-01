package com.red.action;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dao.ProblemDao;
import com.dao.UserDao;
import com.dao.Imp.ProblemDaoImp;
import com.dao.Imp.UserDaoImp;
import com.opensymphony.xwork2.ActionSupport;
import com.problem.problem;
import com.user.user;

public class ProblemAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String problem_name;
	private String problem_content;
	private String problem_labels;
	HttpServletRequest request = ServletActionContext.getRequest();
	
	public String showProblemById() throws Exception{
		int problem_id = Integer.parseInt(request.getParameter("problem_id")); //获得页面传递的user_id
		problem p = new problem();
		ProblemDao dao = new ProblemDaoImp();
		p = dao.queryProblemById(problem_id);
		request.setAttribute("p", p);
		
		return "showProblemById_success";
	}
	
	public String queryProblemById() throws Exception{
		int problem_id = Integer.parseInt(request.getParameter("problem_id")); //获得页面传递的user_id
		problem p = new problem();
		ProblemDao dao = new ProblemDaoImp();
		p = dao.queryProblemById(problem_id);
		request.setAttribute("p", p);
		
		return "queryProblemById_success";
	}
	
	
	public String getProblem_name() {
		return problem_name;
	}
	public void setProblem_name(String problem_name) {
		this.problem_name = problem_name;
	}
	public String getProblem_content() {
		return problem_content;
	}
	public void setProblem_content(String problem_content) {
		this.problem_content = problem_content;
	}
	public String getProblem_labels() {
		return problem_labels;
	}
	public void setProblem_labels(String problem_labels) {
		this.problem_labels = problem_labels;
	}
}
