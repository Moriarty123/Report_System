package com.tyt.po;

public class Student {

	private long studentNo;
	private String studentName;
	private String password;
	private String insititutes;
	private String major;
	private int grade;
	private int classes;
	private int testStatus;
	private int scoreStatus;
	private String sex;
	private int roleNo;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(long studentNo, String studentName, String password,
			String insititutes, String major, int grade, int classes,
			int testStatus, int scoreStatus, String sex, int roleNo) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.password = password;
		this.insititutes = insititutes;
		this.major = major;
		this.grade = grade;
		this.classes = classes;
		this.testStatus = testStatus;
		this.scoreStatus = scoreStatus;
		this.sex = sex;
		this.roleNo = roleNo;
	}

	public long getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(long studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getInsititutes() {
		return insititutes;
	}

	public void setInsititutes(String insititutes) {
		this.insititutes = insititutes;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClasses() {
		return classes;
	}

	public void setClasses(int classes) {
		this.classes = classes;
	}

	public int getTestStatus() {
		return testStatus;
	}

	public void setTestStatus(int testStatus) {
		this.testStatus = testStatus;
	}

	public int getScoreStatus() {
		return scoreStatus;
	}

	public void setScoreStatus(int scoreStatus) {
		this.scoreStatus = scoreStatus;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getRoleNo() {
		return roleNo;
	}

	public void setRoleNo(int roleNo) {
		this.roleNo = roleNo;
	}
	

}
