package com.njupt.swg.dao;

import com.njupt.swg.model.User;

public interface IUserDao {
	User findById(int id);
	
	User findBySSO(String sso);
	
	void save(User user);
}
