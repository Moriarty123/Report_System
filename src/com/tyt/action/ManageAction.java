package com.tyt.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpRequest;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tyt.po.*;
import com.tyt.service.ManageService;

public class ManageAction extends ActionSupport {

	private ManageService service;
	private List gradeList;
	private List majorList;
	private List classList;
	private List courseList;

	// private String grade;
	// private String classNo;
	private String course;
	// private String major;

	private Grade grade;
	private Classes classes;
	private Major major;

	// private boolean isGrade;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
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

	private void Init() {
		// ����spring����
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// �������ļ��л�ȡuserServiceʵ��
		service = (ManageService) ctx.getBean("ManageService");

	}

	public ManageAction() {
		// TODO Auto-generated constructor stub
		Init();

		// isGrade = true;
	}

	//
	public String gradeManage() {

		gradeList = service.getGrade();

		if (!gradeList.isEmpty()) {

			return "success";
		} else {
			return "fail";
		}
	}

	//
	public String majorManage() {
		majorList = service.getMajor();

		if (!majorList.isEmpty()) {
			return "success";
		} else {
			return "fail";
		}
	}

	//
	public String classManage() {
		classList = service.getClasses();

		if (!classList.isEmpty()) {
			return "success";
		} else {
			return "fail";
		}
	}

	//
	public String courseManage() {
		courseList = service.getCourse();

		if (!courseList.isEmpty()) {
			return "success";
		} else {
			return "fail";
		}
	}

	//
	public String deleteListItem() {

		// String itemName =
		//
		// if (service.deleteListItem(hql)) {
		// return "success";
		// }
		// else {
		// return "fail";
		// }
		return "fail";
	}

	//
	public String deleteGrade() {

		int gradeNo = grade.getGrade();
		String hql = "delete from Grade where grade = " + gradeNo;

		if (service.deleteListItem(hql)) {

			addActionMessage("ɾ���ɹ���");
			ActionContext.getContext().put("message", "ɾ���ɹ���");

			return "success";
		} else {
			addActionError("ɾ��ʧ�ܣ�");
			ActionContext.getContext().put("error", "ɾ��ʧ�ܣ�");
			return "fail";
		}
	}

	//
	public String deleteMajor() {

		String majorNo = major.getMajor();
		String hql = "delete from Major where majorNo = '" + majorNo + "'";

		// System.out.println(hql);

		if (service.deleteListItem(hql)) {

			addActionMessage("ɾ���ɹ���");
			ActionContext.getContext().put("message", "ɾ���ɹ���");

			return "success";
		} else {
			addActionError("ɾ��ʧ�ܣ�");
			ActionContext.getContext().put("error", "ɾ��ʧ�ܣ�");
			return "fail";
		}
	}

	//
	public String deleteCourse() {
		String hql = "delete from Course where courseNo =" + course;

		if (service.deleteListItem(hql)) {

			addActionMessage("ɾ���ɹ���");
			ActionContext.getContext().put("message", "ɾ���ɹ���");

			return "success";
		} else {
			addActionError("ɾ��ʧ�ܣ�");
			ActionContext.getContext().put("error", "ɾ��ʧ�ܣ�");
			return "fail";
		}

	}

	//
	public String deleteClass() {

		int classNo = classes.getClassNo();
		String hql = "delete from Classes where classNo =" + classNo;

		if (service.deleteListItem(hql)) {

			addActionMessage("ɾ���ɹ���");
			ActionContext.getContext().put("message", "ɾ���ɹ���");

			return "success";
		} else {
			addActionError("ɾ��ʧ�ܣ�");
			ActionContext.getContext().put("error", "ɾ��ʧ�ܣ�");
			return "fail";
		}

	}

	//
	public String saveGrade() {

		if (service.saveGrade(grade)) {
			addActionMessage("����꼶�ɹ���");
			ActionContext.getContext().put("message", "����꼶�ɹ���");
			return "success";
		} else {
			addActionError("�꼶�Ѵ��ڣ�");
			ActionContext.getContext().put("error", "�꼶�Ѵ��ڣ�");
			return "fail";
		}

	}

}
