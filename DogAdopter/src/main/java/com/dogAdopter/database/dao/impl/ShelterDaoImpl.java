package com.dogAdopter.database.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dogAdopter.database.dao.ShelterDao;
import com.dogAdopter.entity.Shelter;
import com.dogAdopter.util.CustomHibernateDaoSupport;

@Repository("shelterDao")
public class ShelterDaoImpl extends CustomHibernateDaoSupport implements ShelterDao {

	public void save(Shelter shelter) {
		getHibernateTemplate().save(shelter);
	}

	public void update(Shelter shelter) {
		getHibernateTemplate().update(shelter);
	}

	public void delete(Shelter shelter) {
		getHibernateTemplate().delete(shelter);
	}
	
	public List<Shelter> getAll() {
		List<Shelter> list = ((ShelterDao) getHibernateTemplate()).getAll();
		if(list.isEmpty()){
			return null;
		}
		return list;
	}

}
