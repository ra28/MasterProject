package com.dogadopter.entity;

import java.awt.Image;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

public class Announcement implements Serializable {

	private int idAnnouncement;
	private int idShelter;
	private String comment;
	private Date date;
	private Time time;
	private String imageUrl;

	public Announcement() {
		super();
	}

	public Announcement(int idAnnouncement, String comment, Date date, Time time, int idShelter, String imageUrl) {
		super();
		this.idAnnouncement = idAnnouncement;
		this.comment = comment;
		this.date = date;
		this.time = time;
		this.idShelter = idShelter;
		this.imageUrl = imageUrl;
	}

	public int getIdAnnouncement() {
		return idAnnouncement;
	}

	public void setIdAnnouncement(int idAnnouncement) {
		this.idAnnouncement = idAnnouncement;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public int getIdShelter() {
		return idShelter;
	}

	public void setIdShelter(int idShelter) {
		this.idShelter = idShelter;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
