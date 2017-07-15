package com.njupt.swg.dao;

import java.util.List;

import com.njupt.swg.model.UserProfile;

public interface IUserProfileDao {
	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);	
}
