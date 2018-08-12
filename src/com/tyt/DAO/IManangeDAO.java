package com.tyt.DAO;

import java.util.List;

public interface IManangeDAO {

	public List getGrade(String Hql);
	
	public List getMajor(String Hql);
	
	public List getClass(String Hql);
	
	public List getCourse(String Hql);
	
	public List getListByHql(String hql);
	
}
