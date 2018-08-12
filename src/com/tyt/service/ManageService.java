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
		String hql = "select grade from Grade";
		
		List list = manageDAO.getGrade(hql);
		
		return list;
	}
	
	//
	public List getMajor() {
		String hql = "select major from Major";
		
		List list = manageDAO.getMajor(hql);
		
		return list;
	}

	//
	public List getClasses() {
		String hql = "select classes from Classes";
		
		List list = manageDAO.getMajor(hql);
		
		return list;
	}
	
	//
	public List getCourse() {
		String hql = "select courseName from Course";
		
		List list = manageDAO.getMajor(hql);
		
		return list;
	}
}
