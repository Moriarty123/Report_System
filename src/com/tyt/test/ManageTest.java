package com.tyt.test;

import java.util.List;

import javassist.bytecode.Descriptor.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.support.DaoSupport;

import com.tyt.DAO.ManageDAO;
import com.tyt.DAO.UserDAO;
import com.tyt.po.Grade;
import com.tyt.service.ManageService;

public class ManageTest {

	public ManageTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

//		 ManageDAO dao = (ManageDAO)context.getBean("ManageDAO");
//		
//		 List list = dao.getGrade("from Grade");
//		
//		 java.util.Iterator iterat= list.iterator();
//		
//		 while (iterat.hasNext()) {
//		 // System.out.println(iterat.next());
//		 Grade grade = (Grade)iterat.next();
//		
//		 System.out.println(grade.getGrade());
//		 }

		ManageService service = (ManageService) context
				.getBean("ManageService");
		List list = service.getGrade();
		
		java.util.Iterator iterat = list.iterator();
		
		while (iterat.hasNext()) {
			// System.out.println(iterat.next());
		 

			System.out.println(iterat.next());
		}

	}

}
