package com.tyt.action;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.tyt.service.ManageService;

public class ManageAction {

	private ManageService service;
	private List gradeList;
	private List majorList;
	private List classList;
	private List courseList;
	
//	private boolean isGrade;
	
	public ManageService getService() {
		return service;
	}

	public void setService(ManageService service) {
		this.service = service;
	}

	public List getGradeList() {
		return gradeList;
	}

	public void setGradeList(List gradeList) {
		this.gradeList = gradeList;
	}

	public List getMajorList() {
		return majorList;
	}

	public void setMajorList(List majorList) {
		this.majorList = majorList;
	}

	public List getClassList() {
		return classList;
	}

	public void setClassList(List classList) {
		this.classList = classList;
	}

	public List getCourseList() {
		return courseList;
	}

	public void setCourseList(List courseList) {
		this.courseList = courseList;
	}

	private void Init(){
		//����spring����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//�������ļ��л�ȡuserServiceʵ��
		service = (ManageService)ctx.getBean("ManageService");
		
	}
	
	public ManageAction() {
		// TODO Auto-generated constructor stub
		Init();
		
//		isGrade = true;
	}

	//
	public String gradeManage() {

		
		gradeList = service.getGrade();
		
//		isGrade = false;
//		System.out.println(gradeList.isEmpty());
		
		if (!gradeList.isEmpty()) {
//			session.put("isGrade", "true");
//			System.out.println(gradeList);
			return "success";
		}
		else {
			return "fail";
		}
	}
	
	//
	public String majorManage() {
		majorList = service.getMajor();

		if (!majorList.isEmpty()) {
			System.out.println(majorList);
			return "success";
		}
		else {
			return "fail";
		}
	}
	
	//
	public String classManage() {
		classList = service.getClasses();

		if (!classList.isEmpty()) {
			System.out.println(classList);
			return "success";
		}
		else {
			return "fail";
		}
	}
	
	//
	public String courseManage() {
		courseList = service.getCourse();

		if (!courseList.isEmpty()) {
			System.out.println(courseList);
			return "success";
		}
		else {
			return "fail";
		}
	}
	
}
