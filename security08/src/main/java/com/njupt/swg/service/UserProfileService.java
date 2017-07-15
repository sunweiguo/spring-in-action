package com.njupt.swg.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.njupt.swg.dao.IUserProfileDao;
import com.njupt.swg.model.UserProfile;

@Service("userProfileService")
@Transactional
public class UserProfileService implements IUserProfileService {
	@Autowired
	IUserProfileDao userProfileDao;
	
	public List<UserProfile> findAll() {
		return this.userProfileDao.findAll();
	}

	public UserProfile findByType(String type) {
		return this.userProfileDao.findByType(type);
	}

	public UserProfile findById(int id) {
		return this.userProfileDao.findById(id);
	}

}
