package com.dogadopter.service;

import java.util.List;

import com.dogadopter.entity.Dog;

public interface DogService {

	void save(Dog dog);
	void update(Dog dog);
	void delete(Dog dog);
	
	public List<Dog> getAll();
	public List<Dog> getByIdOfShleter(int id);
	
}
