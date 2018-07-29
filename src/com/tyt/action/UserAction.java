package com.tyt.action;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.jdbc.log.Log;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tyt.po.User;
import com.tyt.service.UserService;
import com.tyt.util.XMLUtil;

public class UserAction extends ActionSupport {

	private User user;
	private UserService userService;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserAction() {
		// TODO Auto-generated constructor stub
		Init();
	}

	// ��ʼ������
	public void Init() {
		// ����spring����
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// �������ļ��л�ȡuserServiceʵ��
		userService = (UserService) ctx.getBean("UserService");

	}

	//
	public String login() {
		// System.out.println("user.login");
		Map session = ActionContext.getContext().getSession();

		String userName = user.getUserName();
		String password = user.getPassword();

		// ����˺Ż������κ�һ��Ϊ�գ����ص���¼ҳ�档
		if (userName.equals("") || userName == null || password.equals("")
				|| password == null) {
			addActionError("�˺Ż����벻��Ϊ�գ�");
			ActionContext.getContext().put("error", "�˺Ż����벻��Ϊ�գ�");

			return "input";
		} else if (!userService.find(user)) {
			addActionError("���û������ڣ�");
			ActionContext.getContext().put("error", "���û������ڣ�");
			return "input";
		} else {
//			addActionMessage("��¼�ɹ���");
//			ActionContext.getContext().put("message", "��¼�ɹ���");
			session.put("userName", userName);
			session.put("password", password);
		}

		if (userName.length() == 12) {
			ActionContext.getContext().put("isStudent", "true");
			// ActionContext.getContext().getSession().put("isStudent", "true");
			session.put("isStudent", "true");
			session.put("isTeacher", "false");
		}

		else if (userName.length() == 7) {
			ActionContext.getContext().put("isTeacher", "true");
			// ActionContext.getContext().getSession().put("isStudent", "true");
			session.put("isStudent", "false");
			session.put("isTeacher", "true");
		} else {
			ActionContext.getContext().put("error", "�û������Ϸ���");
			return "input";
		}

		if (user != null) {
			XMLUtil util = new XMLUtil();
			boolean flag = util.writeUser(user);

			// System.out.println(flag);
			if (!flag) {
				System.out.println("д��Context.xmlʧ��");
			}
		}

		if (userService.login(user)) {

			session.put("isLogin", "true");

			addActionMessage("��¼�ɹ���");
			ActionContext.getContext().put("message", "��¼�ɹ���");
//			System.out.println("login");
			return "success";
		}
		else {
			addActionError("�û������������");
			ActionContext.getContext().put("error", "�û������������");
			session.put("isLogin", "false");
			return "fail";
		}

		
	}

	//
	public String register() {

		Map session = ActionContext.getContext().getSession();

		String userName = user.getUserName();
		String password = user.getPassword();

		// System.out.println("user:" + userName+" "+password);
		// ����˺Ż������κ�һ��Ϊ�գ����ص���¼ҳ�档
		if (userName.equals("") || userName == null || password.equals("")
				|| password == null) {
			addActionError("�˺Ż����벻��Ϊ�գ�");
			// System.out.println("�˺Ż����벻��Ϊ�գ�");
			ActionContext.getContext().put("message", "�˺Ż����벻��Ϊ�գ�");

			return "input";
		} else if (userService.find(user)) {
			addActionError("���û��Ѵ��ڣ�");
			// System.out.println("���û��Ѵ��ڣ�");
			ActionContext.getContext().put("message", "���û��Ѵ��ڣ�");
			return "input";
		} else {
			addActionMessage("ע��ɹ���");
			// System.out.println("ע��ɹ���");
			ActionContext.getContext().put("message", "ע��ɹ���");
			session.put("userName", userName);
			session.put("password", password);
		}
		// Init();

		if (userName.length() == 12) {
			ActionContext.getContext().put("isStudent", "true");
			// ActionContext.getContext().getSession().put("isStudent", "true");
			session.put("isStudent", "true");
			session.put("isTeacher", "false");
		}

		else if (userName.length() == 7) {
			ActionContext.getContext().put("isTeacher", "true");
			// ActionContext.getContext().getSession().put("isStudent", "true");
			session.put("isStudent", "false");
			session.put("isTeacher", "true");
		} else {
			addActionError("�û������Ϸ���");
			ActionContext.getContext().put("message", "�û������Ϸ���");
			return "input";
		}

		if (user != null) {
			XMLUtil util = new XMLUtil();
			boolean flag = util.writeUser(user);

			// System.out.println(flag);
			if (!flag) {
				System.out.println("д��Context.xmlʧ��");
			}
		}

		if (userService.register(user)) {
			session.put("isLogin", "true");
			// System.out.println("register");
			return "success";
		}

		return "fail";

	}

	//
	public String update() {
		if (userService.update(user)) {
			return "success";
		}

		return "fail";
	}

	//
	public String delete() {
		if (userService.delete(user)) {
			return "success";
		}

		return "fail";
	}

	//
	public String logout() {

		try {
			ActionContext.getContext().getSession().put("isLogin", "false");

			Map session = ActionContext.getContext().getSession();
			session.put("userName", null);

			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "fail";

	}

}
