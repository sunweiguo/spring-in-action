package com.njupt.swg.dao;

import java.util.List;

import com.njupt.swg.model.User;

public interface IUserDao {
	public void addUser(User user);
	public List<User> listAllUsers();
	public void delete(int id);
	public User loadById(int id);
}
