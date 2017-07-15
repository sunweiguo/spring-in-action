package com.njupt.swg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.njupt.swg.dao.IUserDao;
import com.njupt.swg.model.User;

@Service("userService")
@Transactional
public class UserService implements IUserService {
	@Autowired
	private IUserDao userDao;
	public User findById(int id) {
		return userDao.findById(id);
	}

	public User findBySso(String sso) {
		return userDao.findBySSO(sso);
	}

}
