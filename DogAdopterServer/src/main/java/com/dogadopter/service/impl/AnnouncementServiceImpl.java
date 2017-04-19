package com.dogadopter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dogadopter.database.dao.AnnouncementDao;
import com.dogadopter.entity.Announcement;
import com.dogadopter.service.AnnouncementService;

@Service("announcementService")
public class AnnouncementServiceImpl implements AnnouncementService{

	@Autowired
	AnnouncementDao announcementDao;
	
	public void save(Announcement announcement) {
		announcementDao.save(announcement);
	}

	public void update(Announcement announcement) {
		announcementDao.update(announcement);
	}

	public void delete(Announcement announcement) {
		announcementDao.delete(announcement);
	}

}
