package com.dogadopter.database.dao;

import com.dogadopter.entity.Dog;
import com.dogadopter.entity.Shelter;

public interface ShelterDao {
	void save(Shelter shelter);
	void update(Shelter shelter);
	void delete(Shelter shelter);
}
