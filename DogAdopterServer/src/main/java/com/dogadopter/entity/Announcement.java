package com.dogadopter.entity;

import java.awt.Image;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Announcement", catalog = "mydb")
public class Announcement implements Serializable {

	private int idAnnouncement;
	private int idShelter;
	private String comment;
	private Date date;
	private String imageUrl;

	public Announcement() {
		super();
	}

	public Announcement(int idAnnouncement, String comment, Date date, int idShelter, String imageUrl) {
		super();
		this.idAnnouncement = idAnnouncement;
		this.comment = comment;
		this.date = date;
		this.idShelter = idShelter;
		this.imageUrl = imageUrl;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idAnnouncement", unique = true, nullable = false)
	public int getIdAnnouncement() {
		return idAnnouncement;
	}

	public void setIdAnnouncement(int idAnnouncement) {
		this.idAnnouncement = idAnnouncement;
	}
	@Column(name = "comment", unique = false, nullable = false, length = 512)
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	@Column(name = "date", unique = false, nullable = false)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(name = "idShelter", unique = true, nullable = false, length = 11)
	public int getIdShelter() {
		return idShelter;
	}

	public void setIdShelter(int idShelter) {
		this.idShelter = idShelter;
	}

	@Column(name = "url", unique = true, nullable = true, length = 128)
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
