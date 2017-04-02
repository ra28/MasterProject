package com.dogadopter.entity;

import java.io.Serializable;

import com.dogadopter.entity.enums.Gender;

public class Dog implements Serializable{

	private int dogId;
	private String name;
	private String bread;
	private Gender gender;
	private int age;
	private double weight;
	private double height;
	private Boolean isSterilized;
	private Boolean isMarked;
	private String anamnesis;
	private int idShelter;
	
	
	
	public Dog() {
		super();
	}


	public Dog(int dogId, String name, String bread, Gender gender, int age, double weight, double height,
			Boolean isSterilized, Boolean isMarked, String anamnesis, int idShelter) {
		super();
		this.dogId = dogId;
		this.name = name;
		this.bread = bread;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.isSterilized = isSterilized;
		this.isMarked = isMarked;
		this.anamnesis = anamnesis;
		this.idShelter = idShelter;
	}


	public int getDogId() {
		return dogId;
	}


	public void setDogId(int dogId) {
		this.dogId = dogId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBread() {
		return bread;
	}


	public void setBread(String bread) {
		this.bread = bread;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public Boolean getIsSterilized() {
		return isSterilized;
	}


	public void setIsSterilized(Boolean isSterilized) {
		this.isSterilized = isSterilized;
	}


	public Boolean getIsMarked() {
		return isMarked;
	}


	public void setIsMarked(Boolean isMarked) {
		this.isMarked = isMarked;
	}


	public String getAnamnesis() {
		return anamnesis;
	}


	public void setAnamnesis(String anamnesis) {
		this.anamnesis = anamnesis;
	}


	public int getIdShelter() {
		return idShelter;
	}


	public void setIdShelter(int idShelter) {
		this.idShelter = idShelter;
	}
	
	
	
	
}
