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

	public String gradeManage() {
//		Map session = ActionContext.getContext().getSession();
		
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
	
}