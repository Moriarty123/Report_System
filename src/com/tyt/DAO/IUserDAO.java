package com.tyt.DAO;

import com.tyt.po.User;

public interface IUserDAO {
	
	public boolean save(User user);//
	public boolean update(User user);//
	public boolean delete(String hql);//
	public boolean find(String hql);//
	
}
