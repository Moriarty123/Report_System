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
		// System.out.println("user.login");
		Map session = ActionContext.getContext().getSession();

		String userName = user.getUserName();
		String password = user.getPassword();

		// 如果账号或密码任何一个为空，返回到登录页面。
		if (userName.equals("") || userName == null || password.equals("")
				|| password == null) {
			addActionError("账号或密码不能为空！");
			ActionContext.getContext().put("error", "账号或密码不能为空！");

			return "input";
		} else if (!userService.find(user)) {
			addActionError("该用户不存在！");
			ActionContext.getContext().put("error", "该用户不存在！");
			return "input";
		} else {
//			addActionMessage("登录成功！");
//			ActionContext.getContext().put("message", "登录成功！");
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
			ActionContext.getContext().put("error", "用户名不合法！");
			return "input";
		}

		if (user != null) {
			XMLUtil util = new XMLUtil();
			boolean flag = util.writeUser(user);

			// System.out.println(flag);
			if (!flag) {
				System.out.println("写入Context.xml失败");
			}
		}

		if (userService.login(user)) {

			session.put("isLogin", "true");

			addActionMessage("登录成功！");
			ActionContext.getContext().put("message", "登录成功！");
//			System.out.println("login");
			return "success";
		}
		else {
			addActionError("用户名或密码错误！");
			ActionContext.getContext().put("error", "用户名或密码错误！");
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
		// 如果账号或密码任何一个为空，返回到登录页面。
		if (userName.equals("") || userName == null || password.equals("")
				|| password == null) {
			addActionError("账号或密码不能为空！");
			// System.out.println("账号或密码不能为空！");
			ActionContext.getContext().put("message", "账号或密码不能为空！");

			return "input";
		} else if (userService.find(user)) {
			addActionError("该用户已存在！");
			// System.out.println("该用户已存在！");
			ActionContext.getContext().put("message", "该用户已存在！");
			return "input";
		} else {
			addActionMessage("注册成功！");
			// System.out.println("注册成功！");
			ActionContext.getContext().put("message", "注册成功！");
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
			addActionError("用户名不合法！");
			ActionContext.getContext().put("message", "用户名不合法！");
			return "input";
		}

		if (user != null) {
			XMLUtil util = new XMLUtil();
			boolean flag = util.writeUser(user);

			// System.out.println(flag);
			if (!flag) {
				System.out.println("写入Context.xml失败");
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
