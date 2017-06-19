package com.dogAdopter.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dogAdopter.database.dao.ShelterDao;
import com.dogAdopter.entity.Shelter;
import com.dogAdopter.service.ShelterService;

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
	public List<Shelter> getAll(){
		return shleterDao.getAll();
	}

}
