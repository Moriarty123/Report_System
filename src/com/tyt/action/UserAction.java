package com.tyt.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyt.po.User;
import com.tyt.service.UserService;

public class UserAction {

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

	// 初始化函数
	public void Init() {
		// 创建spring容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// 从配置文件中获取userService实例
		userService = (UserService) ctx.getBean("UserService");

	}

	//
	public String login() {

		// UserService userService = new UserService();

//		Init();
		// System.out.println(userService);
		// System.out.println(userService.getUserDAO());
		// System.out.println(userService.getUserDAO().getSessionFactory());
		// System.out.println(user.getUserName() + " " + user.getPassword());

		if (userService.login(user)) {
			return "success";
		}

		return "fail";
	}

	//
	public String register() {
		
//		Init();
		
		if (userService.register(user)) {
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
}
