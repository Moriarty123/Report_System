package com.tyt.po;

public class Guide {

	private long guideNo;
	private long courseNo;
	private String guideName;
	private String filePath;
	private String testAim;
	private String testEnvironment;
	private String testTask;
	private String testContent;
	private String testRequire;
	
	public Guide() {
		// TODO Auto-generated constructor stub
	}

	public Guide(long guideNo, long courseNo, String guideName,
			String filePath, String testAim, String testEnvironment,
			String testTask, String testContent, String testRequire) {
		super();
		this.guideNo = guideNo;
		this.courseNo = courseNo;
		this.guideName = guideName;
		this.filePath = filePath;
		this.testAim = testAim;
		this.testEnvironment = testEnvironment;
		this.testTask = testTask;
		this.testContent = testContent;
		this.testRequire = testRequire;
	}

	public long getGuideNo() {
		return guideNo;
	}

	public void setGuideNo(long guideNo) {
		this.guideNo = guideNo;
	}

	public long getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(long courseNo) {
		this.courseNo = courseNo;
	}

	public String getGuideName() {
		return guideName;
	}

	public void setGuideName(String guideName) {
		this.guideName = guideName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getTestAim() {
		return testAim;
	}

	public void setTestAim(String testAim) {
		this.testAim = testAim;
	}

	public String getTestEnvironment() {
		return testEnvironment;
	}

	public void setTestEnvironment(String testEnvironment) {
		this.testEnvironment = testEnvironment;
	}

	public String getTestTask() {
		return testTask;
	}

	public void setTestTask(String testTask) {
		this.testTask = testTask;
	}

	public String getTestContent() {
		return testContent;
	}

	public void setTestContent(String testContent) {
		this.testContent = testContent;
	}

	public String getTestRequire() {
		return testRequire;
	}

	public void setTestRequire(String testRequire) {
		this.testRequire = testRequire;
	}

}
