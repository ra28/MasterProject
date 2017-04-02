package com.dogadopter.database.dao;

import com.dogadopter.entity.Shelter;
import com.dogadopter.entity.User;

public interface UserDao {
	
	void save(User user);
	void update(User user);
	void delete(User user);

}
