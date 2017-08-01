package com.dao.Imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admin.admin;
import com.dao.AdminDao;
import com.hibernate.HibernateUtil;
import com.user.user;

public class AdminDaoImp implements AdminDao{

	Session session = HibernateUtil.getSession();//获得session
	Transaction tr = session.beginTransaction();//开启事务
	
	public void adminRegister(admin ad){
		session.save(ad);
		tr.commit();
	}
	
	public admin validateAdmin(String admin_name, String admin_password) {
		// TODO Auto-generated method stub
			String hql = "from admin ad where ad.admin_name=? and ad.admin_password=?";
			Query query = session.createQuery(hql);
			query.setParameter(0, admin_name);
			query.setParameter(1, admin_password);
			List list = query.list();
			if(list.size() != 0){
				admin ad = (admin) list.get(0);
				return ad;
			}
			HibernateUtil.closeSession();
			return null;
	}
	
	public admin showOwnInfo(int id){
		admin ad = new admin();
		ad = session.load(admin.class, id);
		tr.commit();
		return ad;
	}
	
	public void updateOwnAdmin(admin ad){
		// TODO Auto-generated method stub
		session.merge(ad);
		tr.commit();
	}
	
	public void deleteOwnAdmin(int id){
		Query query = session.createQuery("delete admin where admin_id=:id");
		query.setParameter("id", id);
		query.executeUpdate();
		tr.commit();
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

}
