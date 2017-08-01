package com.dao.Imp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.ProblemDao;
import com.hibernate.HibernateUtil;
import com.problem.problem;
import com.user.user;

public class ProblemDaoImp implements ProblemDao{

	Session session = HibernateUtil.getSession();//获得session
	Transaction tr = session.beginTransaction();//开启事务
	
	public void addProblem(int user_id, problem p) {
		// TODO Auto-generated method stub
//		String hql = "from user as u where u.user_id=user_id";
//		Query q = session.createQuery(hql);
//		List<user> list = q.list();
		user u = session.get(user.class, user_id);
//		Set<problem> ps = u.getProblems();
//		Iterator<problem> it = ps.iterator();
//		while(it.hasNext()){
//			problem p1 = it.next();
//			u.getProblems().add(p1);
//		}
//		u.setProblems(new HashSet<problem>());
//		p.setUsers(new HashSet<user>());
		u.getProblems().add(p);
		tr.commit();
		session.close();
	}
	
	public void deleteProblem(int user_id, int problem_id) {
		// TODO Auto-generated method stub
		user u = session.get(user.class, user_id);
		problem p = session.get(problem.class, problem_id);
		u.getProblems().remove(p);
		//System.out.println(problem_id);
//		Set<problem> ps = u.getProblems();
//		Iterator<problem> it = ps.iterator();
//		while(it.hasNext()){
//			problem p1 = it.next();
//			//System.out.println(p1.getProblem_id());
//			if(p1.getProblem_id() != problem_id){
//				u.getProblems().add(p1);
//			}
//		}
		tr.commit();
		session.close();
	}
	
	public problem showProblemById(int id) {
		// TODO Auto-generated method stub
		problem p = new problem();
		p = session.load(problem.class, id);
		tr.commit();
		return p;
	}
	
	public problem queryProblemById(int id) {
		// TODO Auto-generated method stub
		problem p = new problem();
		p = session.load(problem.class, id);
		//tr.commit();
		return p;
	}

	public user queryUserById(int id) {
		// TODO Auto-generated method stub
		user u = new user();
		u = session.load(user.class, id);
		tr.commit();
		return u;
	}
	public void updateProblem(int user_id, int problem_id, problem p1 ) {
		// TODO Auto-generated method stub
		user u = session.get(user.class, user_id);
		problem p = session.get(problem.class, problem_id);
		u.getProblems().remove(p);
		u.getProblems().add(p1);
		tr.commit();
		session.close();
	}

	
}
