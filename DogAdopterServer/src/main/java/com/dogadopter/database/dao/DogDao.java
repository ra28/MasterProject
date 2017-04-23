package com.dogadopter.database.dao;

import java.util.List;

import com.dogadopter.entity.Announcement;
import com.dogadopter.entity.Dog;

public interface DogDao {
	
	void save(Dog dog);
	void update(Dog dog);
	void delete(Dog dog);
	public List<Dog> getAll();
	public List<Dog> getByIdOfShleter(int id);


}
