package com.dogadopter.database.dao.impl;

import org.springframework.stereotype.Repository;

import com.dogadopter.database.dao.DogDao;
import com.dogadopter.entity.Dog;
import com.dogadopter.util.CustomHibernateDaoSupport;

@Repository("dogDao")
public class DogDaoImpl extends CustomHibernateDaoSupport implements DogDao{

	public void save(Dog dog) {
		getHibernateTemplate().save(dog);
	}

	public void update(Dog dog) {
		getHibernateTemplate().update(dog);
	}

	public void delete(Dog dog) {
		getHibernateTemplate().delete(dog);
	}

}
