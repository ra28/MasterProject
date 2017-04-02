package com.dogadopter.entity;

import java.io.Serializable;

public class Shelter implements Serializable{

	private int idShelter;
	private String name;
	private String address;
	private String number;
	private String location;
	private String city;
	private String bankAccount;
	
	
	public Shelter() {
		super();
	}


	public Shelter(int idShelter, String name, String address, String number, String location, String city,
			String bankAccount) {
		super();
		this.idShelter = idShelter;
		this.name = name;
		this.address = address;
		this.number = number;
		this.location = location;
		this.city = city;
		this.bankAccount = bankAccount;
	}


	public int getIdShelter() {
		return idShelter;
	}


	public void setIdShelter(int idShelter) {
		this.idShelter = idShelter;
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


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getBankAccount() {
		return bankAccount;
	}


	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	
}
