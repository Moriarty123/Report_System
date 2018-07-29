package com.tyt.service;

import com.tyt.DAO.UserDAO;
import com.tyt.po.User;

public class UserService {

	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public UserService() {
		// TODO Auto-generated constructor stub

	}

	//
	public boolean login(User loginUser) {

		String userName = loginUser.getUserName();
		String password = loginUser.getPassword();

		// System.out.println(userName + " " + password);

		String hql = "from User where userName = '" + userName
				+ "' and password = '" + password + "'";

		// userDAO = new UserDAO();

		// System.out.println(userDAO);

		boolean flag = false;
		flag = userDAO.find(hql);

		return flag;

	}

	//
	public boolean register(User regUser) {
		boolean flag = false;
		System.err.println("user:" + regUser);
		if (userDAO.save(regUser)) {
			return true;
		}
		
		return flag;
	}
	
	//
	public boolean update(User updateUser) {
		boolean flag = false;
		
		if (userDAO.update(updateUser)) {
			return true;
		}
		
		return flag;
	}
	
	//
	public boolean delete(User deleteUser) {
		String userName = deleteUser.getUserName();
		
		String hql = "delete from User where userName = '" + userName
				+ "'";
		
		if(userDAO.delete(hql)) {
			return true;
		}
		
		return false;
		
	}
	
	//
	public boolean find(User user) {
		String userName = user.getUserName();
		
		String hql = "from User where userName = '" + userName + "'";
		
		if (userDAO.find(hql)) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
