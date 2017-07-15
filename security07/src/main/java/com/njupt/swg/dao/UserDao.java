package com.njupt.swg.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
	
	public User findById(int id) {
		return (User) getSession().createQuery("from User u where u.id=?").setParameter(0, id).uniqueResult();
	}

	public User findBySSO(String sso) {
		return (User) this.getSession().createQuery("from User u where u.ssoId=?").setParameter(0,sso).uniqueResult();
	}

}
