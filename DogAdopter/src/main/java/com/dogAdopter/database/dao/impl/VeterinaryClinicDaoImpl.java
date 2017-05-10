package com.dogAdopter.database.dao.impl;

import org.springframework.stereotype.Repository;

import com.dogAdopter.database.dao.VeterinaryClinicDao;
import com.dogAdopter.entity.VeterinaryClinic;
import com.dogAdopter.util.CustomHibernateDaoSupport;

@Repository("veterinaryClinicDao")
public class VeterinaryClinicDaoImpl extends CustomHibernateDaoSupport implements VeterinaryClinicDao {

	public void save(VeterinaryClinic clinic) {
		getHibernateTemplate().save(clinic);
	}

	public void update(VeterinaryClinic clinic) {
		getHibernateTemplate().update(clinic);
	}

	public void delete(VeterinaryClinic clinic) {
		getHibernateTemplate().delete(clinic);
	}

}
