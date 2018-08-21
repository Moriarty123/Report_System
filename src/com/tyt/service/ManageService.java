package com.tyt.service;

import java.util.List;

import org.springframework.cglib.core.ClassesKey;

import com.tyt.DAO.ManageDAO;
import com.tyt.po.*;


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

	//
	public boolean saveGrade(Grade newgrade) {
		
		int grade = newgrade.getGrade();
		
		String hql = "from Grade where grade = '" + grade + "'";
//		System.out.println(hql);
		if(manageDAO.saveGrade(newgrade, hql)) {
			return true;
		}
		
		return false;
		
	}

	//
	public boolean saveMajor(Major major) {
		
		String majorName = major.getMajor();
		
		String hql = "from Major where major = '" + majorName + "'";

		if(manageDAO.saveMajor(major, hql)) {
			return true;
		}
		
		return false;
		
		
	}
	
	//
	public boolean saveClass(Classes classes) {
		String className = classes.getClassName();
		
		String hql = "from Classes where className = '" + className + "'";

		if(manageDAO.saveClass(classes, hql)) {
			return true;
		}
		
		return false;
	}

}
