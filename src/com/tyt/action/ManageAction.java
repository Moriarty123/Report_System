package com.tyt.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpRequest;

import com.opensymphony.xwork2.ActionContext;
import com.tyt.service.ManageService;

public class ManageAction {

	private ManageService service;
	private List gradeList;
	private List majorList;
	private List classList;
	private List courseList;
	
	private String grade;
	private String classNo;
	private String course;
	private String major;
	
	
	
	
//	private boolean isGrade;
	
	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classes) {
		this.classNo = classes;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

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

		if (!gradeList.isEmpty()) {

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
			return "success";
		}
		else {
			return "fail";
		}
	}
	
	//
	public String deleteListItem() {
		
//		String itemName = 
//		
//		if (service.deleteListItem(hql)) {
//			return "success";
//		}
//		else {
//			return "fail";
//		}
		return "fail"; 
	}
	
	//
	public String deleteGrade() {
		
		String hql = "delete from Grade where grade =" + grade;
		
		if (service.deleteListItem(hql)) {
			return "success";
		}
		else {
			return "fail";
		}
	}
	
	//
	public String deleteMajor() {
		String hql = "delete from Major where majorNo = '" + major + "'";
		
//		System.out.println(hql);
		
		if (service.deleteListItem(hql)) {
			return "success";
		}
		else {
			return "fail";
		}
	}
	
	//
	public String deleteCourse() {
		String hql = "delete from Course where courseNo =" + course;
		
		if (service.deleteListItem(hql)) {
			return "success";
		}
		else {
			return "fail";
		}
		
	}
	
	//
	public String deleteClass() { 
		
		String hql = "delete from Classes where classNo =" + classNo;
		
		if (service.deleteListItem(hql)) {
			return "success";
		}
		else {
			return "fail";
		}
		
	}
	
}
