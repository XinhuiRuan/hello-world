package com.red.action;

import java.util.Iterator;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.ProblemDao;
import com.dao.UserDao;
import com.dao.Imp.ProblemDaoImp;
import com.dao.Imp.UserDaoImp;
import com.hibernate.HibernateUtil;
import com.job.job;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.problem.problem;
import com.user.user;

public class MainAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int user_id;
	private String user_name;
	private String user_password;
	HttpServletRequest request = ServletActionContext.getRequest(); 
	
	public String userLogin() throws Exception{
		boolean validated = false;
		UserDao dao = new UserDaoImp();
		user u = dao.validateUser(getUser_name(), getUser_password());
		
		user_id = u.getUser_id();
		//setUser_id(user_id);
		
		//System.out.println(user_id);
		if(u != null){
			validated = true;
		}
		if(validated){
			
			ActionContext.getContext().getSession().put("user_id", getUser_id());
			ActionContext.getContext().getSession().put("user_name", getUser_name());
			
			return "login_success";
		}
		else{
			return "login_error";
		}
		
	}
	
	public String showProblem() throws Exception{
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int user_id = (Integer) ActionContext.getContext().getSession().get("user_id");
		user u = s.get(user.class, user_id);
//		System.out.println(u.getUser_id());
		Set<problem> problems = u.getProblems();
//		for(Iterator<problem> it = problems.iterator(); it.hasNext();){
//			problem p = it.next();
//			System.out.println(p.getProblem_name());
//		}
		
		tx.commit();
//		request.setAttribute("u", u);
		request.setAttribute("set1", problems);
		return "show_success";
	}

	public String showProblemById() throws Exception{
		int problem_id = Integer.parseInt(request.getParameter("problem_id")); //获得页面传递的user_id
		problem p = new problem();
		ProblemDao dao = new ProblemDaoImp();
		p = dao.queryProblemById(problem_id);
		request.setAttribute("p", p);
		
		return "showProblemById_success";
	}
	
	public String addProblem() throws Exception{
		//user_id = u.getUser_id();
		int user_id = (Integer) ActionContext.getContext().getSession().get("user_id");
		problem p = new problem();
		p.setProblem_name(request.getParameter("problem_name"));
		p.setProblem_content(request.getParameter("problem_content"));
		p.setProblem_labels(request.getParameter("problem_labels"));
		ProblemDao dao = new ProblemDaoImp();
		dao.addProblem(user_id, p);
		return "add_success";
		
	}
	
	public String deleteProblem() throws Exception{
		int user_id = (Integer) ActionContext.getContext().getSession().get("user_id");
		int problem_id = Integer.parseInt(request.getParameter("problem_id"));
		ProblemDao dao = new ProblemDaoImp();
		dao.deleteProblem(user_id, problem_id);
		
		return "delete_success";
	}
	
	public String queryProblemById() throws Exception{
		int problem_id = Integer.parseInt(request.getParameter("problem_id")); //获得页面传递的user_id
		int user_id = (Integer) ActionContext.getContext().getSession().get("user_id");
		problem p = new problem();
		user u = new user();
		ProblemDao dao = new ProblemDaoImp();
		p = dao.queryProblemById(problem_id);
		u = dao.queryUserById(user_id);
		//request.setAttribute("u", u);
		request.setAttribute("p", p);
		return "queryProblemById_success";
	}
	
	public String updateProblem() throws Exception{
		int user_id = (Integer) ActionContext.getContext().getSession().get("user_id");
		int problem_id = Integer.parseInt(request.getParameter("problem_id"));
		problem p = new problem();
		p.setProblem_name(request.getParameter("problem_name"));
		p.setProblem_content(request.getParameter("problem_content"));
		p.setProblem_labels(request.getParameter("problem_labels"));
		ProblemDao dao = new ProblemDaoImp();
		dao.updateProblem(user_id, problem_id, p);

		return "update_success";
	}
	
	public String addJob() throws Exception{
		Session session = HibernateUtil.getSession();//获得session
		Transaction tr = session.beginTransaction();
		int user_id = (Integer) ActionContext.getContext().getSession().get("user_id");
		job j = new job();
		problem p = new problem();
		j.setJob_name(request.getParameter("job_name"));
		int problem_id = Integer.parseInt(request.getParameter("jobProblem"));
		p = session.load(problem.class, problem_id);
//		j.getP().setProblem_name(request.getParameter("jobProblem"));
		j.setJob_type(request.getParameter("jobType"));
		j.setJob_strategy(request.getParameter("jobStrategy"));
		j.setJob_priority(request.getParameter("jobPriority"));
		j.setP(p);
		session.save(j);
		tr.commit();
//		problem p1 = j.getP();
//		String problem_content = p1.getProblem_content();
//		System.out.println(problem_content);
		return "addJob_success";
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

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
}
