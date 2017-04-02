package com.dogadopter.entity;

import java.io.Serializable;

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


	public int getIdVC() {
		return idVC;
	}


	public void setIdVC(int idVC) {
		this.idVC = idVC;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	
}
