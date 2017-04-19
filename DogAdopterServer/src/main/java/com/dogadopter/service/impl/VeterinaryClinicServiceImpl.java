package com.dogadopter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dogadopter.database.dao.VeterinaryClinicDao;
import com.dogadopter.entity.VeterinaryClinic;
import com.dogadopter.service.VeterinaryClinicService;

@Service("veterinaryClinicService")
public class VeterinaryClinicServiceImpl implements VeterinaryClinicService{

	@Autowired
	VeterinaryClinicDao vtDao;

	public void save(VeterinaryClinic clinic) {
		vtDao.save(clinic);
		
	}

	public void update(VeterinaryClinic clinic) {
		vtDao.update(clinic);
		
	}

	public void delete(VeterinaryClinic clinic) {
		vtDao.delete(clinic);
		
	}
}
