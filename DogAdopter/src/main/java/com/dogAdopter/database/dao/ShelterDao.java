package com.dogAdopter.database.dao;

import com.dogAdopter.entity.Shelter;

public interface ShelterDao {
	void save(Shelter shelter);
	void update(Shelter shelter);
	void delete(Shelter shelter);
}
