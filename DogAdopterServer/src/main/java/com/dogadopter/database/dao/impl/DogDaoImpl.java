package com.dogadopter.database.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dogadopter.database.dao.DogDao;
import com.dogadopter.entity.Dog;
import com.dogadopter.entity.User;
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
	
	public List<Dog> getAll(){
		List<Dog> list = getHibernateTemplate().findByNamedQuery(Dog.FIND_ALL_DOGS);
		if(list.isEmpty()){
			return null;
		}
		return list;
	}
	
	public List<Dog> getByIdOfShleter(int idShelter){
		List<Dog> list = getHibernateTemplate().findByNamedQueryAndNamedParam(Dog.FIND_DOGS_BY_ID_OF_SHELTER, "idShelter", idShelter);
		if(list.isEmpty()){
			return null;
		}
		return list;
	}
	

}
