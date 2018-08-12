package com.tyt.DAO;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class ManageDAO extends HibernateDAO implements IManangeDAO{

	private Log log = LogFactory.getLog(UserDAO.class);
	
	public Log getLog() {
		return log;
	}

	public void setLog(Log log) {
		this.log = log;
	}

	public ManageDAO() {
		// TODO Auto-generated constructor stub
	}

	//
	public List getGrade(String hql) {
		
		log.debug("finding grades instance by hql");

		// SessionFactory sf = new
		// Configuration().configure().buildSessionFactory();
		// session = sf.openSession();

		Session session = getSession();

		try {
			String queryString = hql;
			Query queryObject = session.createQuery(queryString);

			// System.out.println(queryObject);

			return queryObject.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} catch (RuntimeException re) {
			log.error("find by hql failed", re);
			re.printStackTrace();
			throw re;
		} finally {
			session.close();
		}
		
	}

	//
	public List getMajor(String hql) {
		log.debug("finding major instance by hql");

		Session session = getSession();

		try {
			String queryString = hql;
			Query queryObject = session.createQuery(queryString);

			return queryObject.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} catch (RuntimeException re) {
			log.error("find by hql failed", re);
			re.printStackTrace();
			throw re;
		} finally {
			session.close();
		}
	}

	
}
