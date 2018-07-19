package com.tyt.po;

public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	private long userNo;
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User(long userNo, String userName, String password) {
		super();
		this.userNo = userNo;
		this.userName = userName;
		this.password = password;
	}
	public long getUserNo() {
		return userNo;
	}
	public void setUserNo(long userNo) {
		this.userNo = userNo;
	}
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String toString() {
		return "UserDAO [userName=" + userName + ", password=" + password + "]";
	}

}
