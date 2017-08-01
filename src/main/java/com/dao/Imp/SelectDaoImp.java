package com.dao.Imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.SelectDao;
import com.hibernate.HibernateUtil;
import com.problem.problem;

public class SelectDaoImp implements SelectDao{

	Session session = HibernateUtil.getSession();//获得session
	Transaction tr = session.beginTransaction();//开启事务
	
	public List<problem> selectProblem() {
		// TODO Auto-generated method stub
		String hql="from problem";
		Query query = session.createQuery(hql);
		List<problem> list = query.list();
		tr.commit();
		return list;
	}

}
