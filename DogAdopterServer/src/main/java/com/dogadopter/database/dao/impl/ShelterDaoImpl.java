package com.dogadopter.database.dao.impl;

import org.springframework.stereotype.Repository;

import com.dogadopter.database.dao.ShelterDao;
import com.dogadopter.entity.Shelter;
import com.dogadopter.util.CustomHibernateDaoSupport;

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

}
