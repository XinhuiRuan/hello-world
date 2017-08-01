package com.dao.Imp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.UserDao;
import com.hibernate.HibernateUtil;
import com.user.user;

public class UserDaoImp implements UserDao{

	Session session = HibernateUtil.getSession();//获得session
	Transaction tr = session.beginTransaction();//开启事务
	
	public void adduser(user u) {
		// TODO Auto-generated method stub
	try{
		session.save(u);//添加数据
		tr.commit();//提交事务
		}catch(Exception e){
			session.getTransaction().rollback();  //事务回滚
			System.out.println("Fail to add data");
			e.printStackTrace();
		}finally{
			HibernateUtil.closeSession();
		}
	}

	public List<user> queryAllUser() {	
		String hql="from user";
		Query query = session.createQuery(hql);
		List<user> list =query.list();//查询全部
		tr.commit();//提交事务
		return list;	
	}

	public user queryUserById(int id) {
		// TODO Auto-generated method stub
		user u = new user();
		u = session.load(user.class, id);
		tr.commit();
		return u;
	}

	public void updateUser(user u) {
		// TODO Auto-generated method stub
		//session.update(u);
		session.merge(u);
		tr.commit();
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		Query query = session.createQuery("delete user where user_id=:id");
		query.setParameter("id", id);
		query.executeUpdate();
		tr.commit();
	}

	public user validateUser(String user_name, String user_password) {
		// TODO Auto-generated method stub
		String hql = "from user u where u.user_name=? and u.user_password=?";
		Query query = session.createQuery(hql);
		query.setParameter(0,user_name);
		query.setParameter(1,user_password);
		List list = query.list();
		if(list.size() != 0){
			user u = (user) list.get(0);
			return u;
		}
		HibernateUtil.closeSession();
		return null;
	}	

}
