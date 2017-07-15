package com.njupt.swg.service;

import java.util.List;

import com.njupt.swg.model.UserProfile;

public interface IUserProfileService {
	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
