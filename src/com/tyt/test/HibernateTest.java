package com.tyt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyt.DAO.UserDAO;
import com.tyt.po.User;
import com.tyt.service.UserService;

public class HibernateTest {

	public HibernateTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		UserDAO dao = (UserDAO) context.getBean("UserDAO");
//		
//		
//		User user = new User("111", "111");
//		
//		boolean flag = dao.save(user);
//		
//		System.out.println(flag);
		
//		UserService service = (UserService) context.getBean("UserService");
//		
//		User user = new User("222", "111");
//		
//		boolean flag = service.register(user);
//		
//		System.out.println(flag);
		
//		UserService service = (UserService) context.getBean("UserService");
//		
//		User user = new User("222", "222");
//		
//		boolean flag = service.update(user);
//		
//		System.out.println(flag);
		
//		UserService service = (UserService) context.getBean("UserService");
//		
//		User user = new User("222", "222");
//		
//		boolean flag = service.delete(user);
//		
//		System.out.println(flag);
		
	}

}
