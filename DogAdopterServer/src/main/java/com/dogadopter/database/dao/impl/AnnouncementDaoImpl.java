package com.dogadopter.database.dao.impl;

import org.springframework.stereotype.Repository;
import com.dogadopter.database.dao.AnnouncementDao;
import com.dogadopter.entity.Announcement;
import com.dogadopter.util.CustomHibernateDaoSupport;

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
