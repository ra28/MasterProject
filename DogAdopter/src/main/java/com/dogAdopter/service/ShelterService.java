package com.dogAdopter.service;

import com.dogAdopter.entity.Shelter;

public interface ShelterService {

	void save(Shelter shelter);
	void update(Shelter shelter);
	void delete(Shelter shelter);
}
