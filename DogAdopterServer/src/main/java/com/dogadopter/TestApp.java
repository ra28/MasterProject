package com.dogadopter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dogadopter.entity.Dog;
import com.dogadopter.entity.Shelter;
import com.dogadopter.entity.User;
import com.dogadopter.entity.enums.Gender;
import com.dogadopter.service.DogService;
import com.dogadopter.service.ShelterService;
import com.dogadopter.service.UserService;

public class TestApp {

	public static void main(String[] args) {
		
		
		ApplicationContext appContext =
		    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		
		User user = new User();
		user.setEmail("lukicmihailo@gmail.com");
		user.setFirstName("Ana");
		user.setLastName("Lukic");
		user.setUsername("ana");
		user.setPassword("ana");
		
		UserService userService = (UserService)appContext.getBean("userService");
		userService.save(user);
		
		Shelter shelter = new Shelter();
		shelter.setName("shelter");
		shelter.setAddress("address");
		shelter.setNumber("number");
		shelter.setLocation("location");
		shelter.setCity("city");
		shelter.setBankAccount(00000);
		
		ShelterService shelterService = (ShelterService)appContext.getBean("shelterService");
		shelterService.save(shelter);
		
		Dog dog = new Dog();
		dog.setIdShelter(shelter.getIdShelter());
		dog.setAge(2);
		dog.setAnamnesis("none");
		dog.setBread("bread");
		dog.setGender(0);
		dog.setHeight(10);
		dog.setIsMarked(0);
		dog.setIsSterilized(0);
		dog.setName("dzeki");
		dog.setWeight(10);
		
		DogService dogService = (DogService)appContext.getBean("dogService");
		dogService.save(dog);
		

	}

}
