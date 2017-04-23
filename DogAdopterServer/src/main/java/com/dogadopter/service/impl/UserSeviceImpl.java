package com.dogadopter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dogadopter.database.dao.UserDao;
import com.dogadopter.entity.User;
import com.dogadopter.service.UserService;

@Service("userService")
public class UserSeviceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	public void save(User user) {
		userDao.save(user);
		
	}

	public void update(User user) {
		userDao.update(user);
		
	}

	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public User findUserWithUsernameAndPassword(String username, String password) {
		return userDao.findUserWithUsernameAndPassword(username, password);
	}

}
