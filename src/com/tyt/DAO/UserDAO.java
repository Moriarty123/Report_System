package com.tyt.DAO;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.tyt.po.User;

public class UserDAO extends HibernateDAO implements IUserDAO {

	private Log log = LogFactory.getLog(UserDAO.class);

	public UserDAO() {

	}

	public Log getLog() {
		return log;
	}

	public void setLog(Log log) {
		this.log = log;
	}

	//
	public List findByHql(String hql) {

		log.debug("finding loginUser instance by hql");

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

	public boolean save(User user) {
		// TODO Auto-generated method stub
		log.debug("save user instance");

		Transaction tran = null;
		Session session = null;

		try {
			// 获取事务
			SessionFactory sf = getSessionFactory();
			session = getSessionFactory().openSession();

			tran = session.beginTransaction();

			String hql = "from User where userName = '" + user.getUserName()
					+ "' and password = '" + user.getPassword() + "'";

			List list = findByHql(hql);

			if (list.isEmpty()) {
				session.save(user);
				tran.commit();

				return true;
			} else {
				ActionContext ctx = ActionContext.getContext();
				Map request = (Map) ctx.get("request");
				request.put("tip", "该用户已存在");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			if (tran != null) {
				tran.rollback();
			}

			e.printStackTrace();
		} finally {
			session.close();
		}

		return false;
	}

	public boolean update(User user) {
		// TODO Auto-generated method stub
		log.debug("save user instance");

		Transaction tran = null;
		Session session = null;

		try {
			// 获取事务

			session = getSession();

			String hql = "from User where userName = '" + user.getUserName()
					+ "'";

			// 设置用户的id
			List list = findByHql(hql);

			if (list.isEmpty()) {
				return false;
			}
			User updateUser = (User) list.get(0);
			long userNo = updateUser.getUserNo();
			user.setUserNo(userNo);

			tran = session.beginTransaction();

			session.update(user);

			tran.commit();

			return true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			if (tran != null) {
				tran.rollback();
			}

			e.printStackTrace();
		} finally {
			session.close();
		}

		return false;

	}

	// 删除用户（注销）
	public boolean delete(String hql) {
		log.debug("delete User");

		Transaction tran = null;
		Session session = null;

		try {
			// 获取事务
			
			session = getSession();

			tran = session.beginTransaction();

			String queryString = hql;

			Query queryObject = getSession().createQuery(queryString);
			queryObject.executeUpdate();

			tran.commit();

			return true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			if (tran != null) {
				tran.rollback();
			}

			e.printStackTrace();
		} finally {
			session.close();
		}

		return true;
	}

	public boolean find(String hql) {
		// TODO Auto-generated method stub
		log.debug("finding loginUser instance by hql");

		// SessionFactory sf = new
		// Configuration().configure().buildSessionFactory();
		// session = sf.openSession();

		Session session = getSession();

		try {
			String queryString = hql;
			Query queryObject = session.createQuery(queryString);

			// System.out.println(queryObject);

			List list = queryObject.list();

			if (!list.isEmpty()) {
				return true;
			}
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

		return false;
	}

}
