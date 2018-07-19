package com.tyt.po;

import java.util.Date;

public class Course {

	private long courseNo;
	private String courseName;
	private String teacherNo;
	private Date createDate;
	private String courseNum;
	private String teacherName;
	private int courseGrade;
	private String courseMajor;
	private String courseClass;
	private int courseTerm;
	private String courseType;
	private String courseNature;
	private int coursePeriod;
	private int testPeriod;
	private String openTime;
	private String credit;
	private String examType;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(long courseNo, String courseName, String teacherNo,
			Date createDate, String courseNum, String teacherName,
			int courseGrade, String courseMajor, String courseClass,
			int courseTerm, String courseType, String courseNature,
			int coursePeriod, int testPeriod, String openTime, String credit,
			String examType) {
		super();
		this.courseNo = courseNo;
		this.courseName = courseName;
		this.teacherNo = teacherNo;
		this.createDate = createDate;
		this.courseNum = courseNum;
		this.teacherName = teacherName;
		this.courseGrade = courseGrade;
		this.courseMajor = courseMajor;
		this.courseClass = courseClass;
		this.courseTerm = courseTerm;
		this.courseType = courseType;
		this.courseNature = courseNature;
		this.coursePeriod = coursePeriod;
		this.testPeriod = testPeriod;
		this.openTime = openTime;
		this.credit = credit;
		this.examType = examType;
	}

	public long getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(long courseNo) {
		this.courseNo = courseNo;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTeacherNo() {
		return teacherNo;
	}

	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getCourseGrade() {
		return courseGrade;
	}

	public void setCourseGrade(int courseGrade) {
		this.courseGrade = courseGrade;
	}

	public String getCourseMajor() {
		return courseMajor;
	}

	public void setCourseMajor(String courseMajor) {
		this.courseMajor = courseMajor;
	}

	public String getCourseClass() {
		return courseClass;
	}

	public void setCourseClass(String courseClass) {
		this.courseClass = courseClass;
	}

	public int getCourseTerm() {
		return courseTerm;
	}

	public void setCourseTerm(int courseTerm) {
		this.courseTerm = courseTerm;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getCourseNature() {
		return courseNature;
	}

	public void setCourseNature(String courseNature) {
		this.courseNature = courseNature;
	}

	public int getCoursePeriod() {
		return coursePeriod;
	}

	public void setCoursePeriod(int coursePeriod) {
		this.coursePeriod = coursePeriod;
	}

	public int getTestPeriod() {
		return testPeriod;
	}

	public void setTestPeriod(int testPeriod) {
		this.testPeriod = testPeriod;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}
	

}
