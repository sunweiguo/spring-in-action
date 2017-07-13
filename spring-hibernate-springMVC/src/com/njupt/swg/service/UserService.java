package com.njupt.swg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njupt.swg.dao.IUserDao;
import com.njupt.swg.model.User;

@Service("userService")
@Transactional
public class UserService implements IUserService {
	@Autowired
	private IUserDao userDao;
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}
	@Override
	public List<User> listAllUSers() {
		return this.userDao.listAllUsers();
	}
	@Override
	public void delete(int id) {
		this.userDao.delete(id);
	}

}
