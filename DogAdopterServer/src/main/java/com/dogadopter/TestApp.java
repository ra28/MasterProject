package com.dogadopter;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dogadopter.entity.Announcement;
import com.dogadopter.entity.Dog;
import com.dogadopter.entity.Shelter;
import com.dogadopter.entity.User;
import com.dogadopter.entity.VeterinaryClinic;
import com.dogadopter.rest.UserRestService;
import com.dogadopter.service.AnnouncementService;
import com.dogadopter.service.DogService;
import com.dogadopter.service.ShelterService;
import com.dogadopter.service.UserService;
import com.dogadopter.service.VeterinaryClinicService;

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
		//userService.save(user);
		
		Shelter shelter = new Shelter();
		shelter.setName("shelter");
		shelter.setAddress("address");
		shelter.setNumber("number");
		shelter.setLocation("location");
		shelter.setCity("city");
		shelter.setBankAccount(00000);
		
		ShelterService shelterService = (ShelterService)appContext.getBean("shelterService");
		//shelterService.save(shelter);
		
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
		//dogService.save(dog);
		
		VeterinaryClinic veterinaryClinic = new VeterinaryClinic();
		veterinaryClinic.setAddress("address");
		veterinaryClinic.setCity("city");
		veterinaryClinic.setName("name");
		veterinaryClinic.setNumber("number");
		
		VeterinaryClinicService vcService = (VeterinaryClinicService)appContext.getBean("veterinaryClinicService");
		//vcService.save(veterinaryClinic);
		
		Announcement announcement = new Announcement();
		announcement.setComment("comment");
		announcement.setDate(new Date());
		announcement.setIdShelter(shelter.getIdShelter());
		announcement.setImageUrl("url");
		
		AnnouncementService announcementService = (AnnouncementService)appContext.getBean("announcementService");
		//announcementService.save(announcement);
		
		UserRestService service = new UserRestService();
		boolean result = service.loginViaApp("ana", "ana");
		

	}

}
