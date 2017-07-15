package com.njupt.swg.service;

import com.njupt.swg.model.User;

public interface IUserService {
	User findById(int id);
	
	User findBySso(String sso);
	
	void save(User user);
}
