package com.njupt.swg.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.njupt.swg.model.User;

@Repository("userDao")
public class UserDao implements IUserDao {
	@Autowired
	private SessionFactory sessionFactory;
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	@Override
	public void addUser(User user) {
		getSession().save(user);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<User> listAllUsers() {
		return this.getSession().createQuery("from User").list();
	}
	@Override
	public void delete(int id) {
		User user = this.loadById(id);
		System.out.println(user.getId());
		this.getSession().delete(user);
	}
	@Override
	public User loadById(int id) {
		return (User) this.getSession().createQuery("from User u where u.id=?").setParameter(0, id).uniqueResult();
	}

}
