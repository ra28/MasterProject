package com.dogadopter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dogadopter.entity.User;
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
		
		

	}

}
