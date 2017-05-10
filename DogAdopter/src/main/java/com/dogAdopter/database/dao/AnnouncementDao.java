package com.dogAdopter.database.dao;

import com.dogAdopter.entity.Announcement;

public interface AnnouncementDao {
	void save(Announcement announcement);
	void update(Announcement announcement);
	void delete(Announcement announcement);
}
