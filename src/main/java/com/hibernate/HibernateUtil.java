package com.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	private static SessionFactory sessionFactory = null;  //sessionFactory Object
	static{
		try{
			Configuration cfg = new Configuration().configure();
			sessionFactory = cfg.buildSessionFactory();
		}catch(Exception e){
			System.err.println("Fail to create sessionFactory");
			e.printStackTrace();
		}
	}
	
	//Get Session
	public static Session getSession() throws HibernateException{
		Session session = threadLocal.get();
		if(session == null || !session.isOpen()){
			if(sessionFactory == null){
				rebuildSessionFactory();
			}
		session = (sessionFactory != null)?sessionFactory.openSession():null;
			threadLocal.set(session);
		}
		return session;
	}
	
	//Rebuild sessionFactory
	public static void rebuildSessionFactory() {
		try{
			Configuration cfg = new Configuration().configure();
			sessionFactory = cfg.buildSessionFactory();
		}catch(Exception e){
			System.err.println("Fail to create sessionFactory");
			e.printStackTrace();
		}
	}
	
	//Get SessionFactory Object
	public static SessionFactory getSessionFactory(){
		return sessionFactory;		
	}
	
	//Close Session
	public static void closeSession() throws HibernateException{
		Session session = threadLocal.get();
		threadLocal.set(null);
		if(session != null){
			session.close();
		}
	}
}
