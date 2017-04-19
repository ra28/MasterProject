package com.dogadopter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dogadopter.database.dao.DogDao;
import com.dogadopter.entity.Dog;
import com.dogadopter.service.DogService;

@Service("dogService")
public class DogServiceImpl implements DogService {

	@Autowired
	DogDao dogDao;
	
	public void save(Dog dog) {
		dogDao.save(dog);
	}

	public void update(Dog dog) {
		dogDao.update(dog);
	}

	public void delete(Dog dog) {
		dogDao.delete(dog);
	}

}
