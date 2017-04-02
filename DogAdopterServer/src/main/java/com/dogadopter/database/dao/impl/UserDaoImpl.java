package com.dogadopter.database.dao.impl;

import org.springframework.stereotype.Repository;

import com.dogadopter.database.dao.UserDao;
import com.dogadopter.entity.User;
import com.dogadopter.util.CustomHibernateDaoSupport;

@Repository("userDao")
public class UserDaoImpl extends CustomHibernateDaoSupport implements UserDao {

	public void save(User user) {
		getHibernateTemplate().save(user);
	}

	public void update(User user) {
		getHibernateTemplate().update(user);
	}

	public void delete(User user) {
		getHibernateTemplate().delete(user);
	}

}
