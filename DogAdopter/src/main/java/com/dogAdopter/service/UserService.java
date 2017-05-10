package com.dogAdopter.service;

import com.dogAdopter.entity.User;

public interface UserService {
	void save(User user);
	void update(User user);
	void delete(User user);
	
	User findUserWithUsernameAndPassword(String username, String password);
}
