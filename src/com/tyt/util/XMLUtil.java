package com.tyt.util;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.tyt.po.User;

public class XMLUtil {

	private static String path = "user.xml";
	
	public boolean writeUser(User user) {
		try {
			
			
			
//			System.out.println(path);
			
			XMLEncoder encoder = new XMLEncoder(

			new BufferedOutputStream(

			new FileOutputStream(path)));

//			System.out.println(encoder);
			
			encoder.writeObject(user);

			encoder.close();

			return true;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	
	public User readUser() {
		try {
			XMLDecoder decoder = new XMLDecoder(

			new BufferedInputStream(

			new FileInputStream(path)));

			User user = (User) decoder.readObject();
			
			decoder.close();

			return user;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
}
