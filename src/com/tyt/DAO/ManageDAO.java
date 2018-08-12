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

		List list = getListByHql(hql);
		
		return list;
		
	}

	//
	public List getMajor(String hql) {
		log.debug("finding major instance by hql");

		List list = getListByHql(hql);
		
		return list;
	}
	
	//
	public List getClass(String hql) {
		log.debug("finding class instance by hql");

		List list = getListByHql(hql);
		
		return list;
	}

	//
	public List getCourse(String hql) {
		log.debug("finding course instance by hql");

		List list = getListByHql(hql);
		
		return list;
	}
	
	//

	public List getListByHql(String hql) {
		// TODO Auto-generated method stub
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
