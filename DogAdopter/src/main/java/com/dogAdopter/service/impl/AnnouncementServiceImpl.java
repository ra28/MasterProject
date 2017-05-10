package com.dogAdopter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dogAdopter.database.dao.AnnouncementDao;
import com.dogAdopter.entity.Announcement;
import com.dogAdopter.service.AnnouncementService;

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
