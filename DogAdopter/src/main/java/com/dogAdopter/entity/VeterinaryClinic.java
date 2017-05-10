package com.dogAdopter.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "VeterinaryClinic", catalog = "mydb")
public class VeterinaryClinic implements Serializable {

	private int idVC;
	private String name;
	private String address;
	private String city;
	private String number;
	
	
	public VeterinaryClinic() {
		super();
	}


	public VeterinaryClinic(int idVC, String name, String address, String city, String number) {
		super();
		this.idVC = idVC;
		this.name = name;
		this.address = address;
		this.city = city;
		this.number = number;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idVeterinaryClinic", unique = true, nullable = false)
	public int getIdVC() {
		return idVC;
	}


	public void setIdVC(int idVC) {
		this.idVC = idVC;
	}

	@Column(name = "name", unique = true, nullable = false, length = 45)
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "address", unique = true, nullable = false, length = 128)
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "city", unique = true, nullable = false, length = 45)
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "phone", unique = true, nullable = true, length = 45)
	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	
}
