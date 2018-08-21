package com.tyt.DAO;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tyt.po.Grade;
import com.tyt.po.Major;

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

	//
	public boolean deleteByHql(String hql) {
		log.debug("delete list item instance");
		
		Session session = null;
		Transaction tran = null;
		
		try {
			SessionFactory sf = getSessionFactory();
			session = sf.openSession();
			tran = session.beginTransaction();
	
			String queryString = hql;
			
			Query query = session.createQuery(queryString);
			query.executeUpdate();
		
			tran.commit();
			return true;
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			if(tran != null) {
				tran.rollback();
			}
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
		return false;
	
	}
	
	//
	public boolean saveGrade(Grade grade, String hql) {
		log.debug("save grade instance");
		
		Session session = null;
		Transaction tran = null;
		

		try {
			SessionFactory sf = getSessionFactory();
			session = sf.openSession();
			tran = session.beginTransaction();
			
			String queryString = hql;
//			System.out.println(hql);
			Query query = session.createQuery(queryString);
			
			List list = query.list();
			
			//涓嶅瓨鍦ㄥ凡鏈夌敤鎴�
			if(list.isEmpty()) {
				session.save(grade);
				tran.commit();
				return true;
			}
			else {
				return false;
			}
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			if(tran != null) {
				tran.rollback();
			}
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
		return false;
	}
	
	//
	public boolean saveMajor(Major major, String hql) {
		log.debug("save major instance");
		
		Session session = null;
		Transaction tran = null;
		

		try {
			SessionFactory sf = getSessionFactory();
			session = sf.openSession();
			tran = session.beginTransaction();
			
			String queryString = hql;
//			System.out.println(hql);
			Query query = session.createQuery(queryString);
			
			List list = query.list();
			
			
			if(list.isEmpty()) {
				session.save(major);
				tran.commit();
				return true;
			}
			else {
				return false;
			}
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			if(tran != null) {
				tran.rollback();
			}
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
		return false;
	}
	
	
}
