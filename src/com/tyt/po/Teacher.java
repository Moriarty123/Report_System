package com.tyt.po;

public class Teacher {

	private long teacherNo;
	private String teacherName;
	private String title;
	private String degree;
	private String email;
	private String phoneNum;
	private String password;
	private long roleNo;
	private String sex;
	private String picturePath;
	
	public Teacher(long teacherNo, String teacherName, String password) {
		super();
		this.teacherNo = teacherNo;
		this.teacherName = teacherName;
		this.password = password;
	}

	public Teacher(long teacherNo, String teacherName, String title,
			String degree, String email, String phoneNum, String password,
			long roleNo, String sex, String picturePath) {
		super();
		this.teacherNo = teacherNo;
		this.teacherName = teacherName;
		this.title = title;
		this.degree = degree;
		this.email = email;
		this.phoneNum = phoneNum;
		this.password = password;
		this.roleNo = roleNo;
		this.sex = sex;
		this.picturePath = picturePath;
	}

	public long getTeacherNo() {
		return teacherNo;
	}

	public void setTeacherNo(long teacherNo) {
		this.teacherNo = teacherNo;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getRoleNo() {
		return roleNo;
	}

	public void setRoleNo(long roleNo) {
		this.roleNo = roleNo;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

}
