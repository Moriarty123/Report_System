package com.tyt.service;

import java.util.List;

import com.tyt.DAO.ManageDAO;

public class ManageService {

	private ManageDAO manageDAO;
	
	public ManageDAO getManageDAO() {
		return manageDAO;
	}

	public void setManageDAO(ManageDAO dao) {
		this.manageDAO = dao;
	}

	public ManageService() {
		// TODO Auto-generated constructor stub
	}
	
	//
	public List getGrade() {
		String hql = "from Grade";
		
		List list = manageDAO.getGrade(hql);
		
		return list;
	}
	
	//
	public List getMajor() {
		String hql = "from Major";
		
		List list = manageDAO.getMajor(hql);
		
		return list;
	}

	//
	public List getClasses() {
		String hql = "from Classes";
		
		List list = manageDAO.getMajor(hql);
		
		return list;
	}
	
	//
	public List getCourse() {
		String hql = "from Course";
		
		List list = manageDAO.getMajor(hql);
		
		return list;
	}

	//
	public boolean deleteListItem(String hql) {
		
		boolean flag = manageDAO.deleteByHql(hql);
		
		return flag;
		
	}
}
