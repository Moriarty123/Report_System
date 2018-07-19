package com.tyt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyt.DAO.UserDAO;
import com.tyt.service.UserService;

public class springTest {

	public springTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserDAO dao = (UserDAO) context.getBean("UserDAO");
		System.out.println(dao.getSessionFactory().getClass());
		System.out.println(dao.getSessionFactory().openSession().getClass());
		
		UserService service = (UserService) context.getBean("userService");
		
		System.out.println(service.getUserDAO().getClass());
	}

}
