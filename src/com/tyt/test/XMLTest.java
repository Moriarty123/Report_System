package com.tyt.test;

import com.tyt.po.User;
import com.tyt.util.XMLUtil;

public class XMLTest {

	public XMLTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XMLUtil util = new XMLUtil();
		
		User user = new User();
		user.setUserName("13537142683");
		user.setPassword("123456789");
		
		System.out.println(util.writeUser(user));
		
		User result = util.readUser();
		
		System.out.println(result.getUserName() + " " + result.getPassword());
		
	}

}
