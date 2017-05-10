package com.dogAdopter.database.dao;

import com.dogAdopter.entity.VeterinaryClinic;

public interface VeterinaryClinicDao {
	void save(VeterinaryClinic clinic);
	void update(VeterinaryClinic clinic);
	void delete(VeterinaryClinic clinic);
}
