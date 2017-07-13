package com.njupt.swg.service;

import java.util.List;

import com.njupt.swg.model.User;

public interface IUserService {
	public void addUser(User user);
	public List<User> listAllUSers();
	public void delete(int id);
}
