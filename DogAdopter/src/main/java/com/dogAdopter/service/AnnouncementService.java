package com.dogAdopter.service;

import com.dogAdopter.entity.Announcement;

public interface AnnouncementService {
	void save(Announcement announcement);
	void update(Announcement announcement);
	void delete(Announcement announcement);
}
