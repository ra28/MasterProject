package com.dogadopter.service;

import com.dogadopter.entity.Announcement;

public interface AnnouncementService {
	void save(Announcement announcement);
	void update(Announcement announcement);
	void delete(Announcement announcement);
}
