package com.dogAdopter.service;

import java.util.List;

import com.dogAdopter.entity.Dog;

public interface DogService {

	void save(Dog dog);
	void update(Dog dog);
	void delete(Dog dog);
	
	public List<Dog> getAll();
	public List<Dog> getByIdOfShleter(int id);
	
}
