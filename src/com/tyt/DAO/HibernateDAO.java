package com.tyt.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateDAO {
	private SessionFactory sessionFactory;
	
	public HibernateDAO() {
		// TODO Auto-generated constructor stub
		
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.openSession();
	}
}
