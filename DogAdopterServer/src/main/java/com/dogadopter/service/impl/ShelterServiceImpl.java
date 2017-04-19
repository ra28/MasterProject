package com.dogadopter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dogadopter.database.dao.ShelterDao;
import com.dogadopter.entity.Shelter;
import com.dogadopter.service.ShelterService;

@Service("shelterService")
public class ShelterServiceImpl implements ShelterService {

	@Autowired
	ShelterDao shleterDao;
	
	public void save(Shelter shelter) {
		shleterDao.save(shelter);	
	}

	public void update(Shelter shelter) {
		shleterDao.update(shelter);
	}

	public void delete(Shelter shelter) {
		shleterDao.delete(shelter);
	}

}
