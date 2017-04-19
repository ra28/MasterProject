package com.dogadopter.service;

import com.dogadopter.entity.Dog;

public interface DogService {

	void save(Dog dog);
	void update(Dog dog);
	void delete(Dog dog);
	
}
