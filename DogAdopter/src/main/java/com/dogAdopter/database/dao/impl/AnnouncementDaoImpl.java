package com.dogAdopter.database.dao.impl;

import org.springframework.stereotype.Repository;

import com.dogAdopter.database.dao.AnnouncementDao;
import com.dogAdopter.entity.Announcement;
import com.dogAdopter.util.CustomHibernateDaoSupport;

@Repository("announcementDao")
public class AnnouncementDaoImpl extends CustomHibernateDaoSupport implements AnnouncementDao{

	public void save(Announcement announcement) {
		getHibernateTemplate().save(announcement);
	}

	public void update(Announcement announcement) {
		getHibernateTemplate().update(announcement);
	}

	public void delete(Announcement announcement) {
		getHibernateTemplate().delete(announcement);
		
	}


}
