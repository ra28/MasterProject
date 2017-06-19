package com.dogAdopter.rest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dogAdopter.service.UserService;

public class BaseRestService {
	
	protected UserService userService;
	
	public BaseRestService(){
		
		ApplicationContext appContext =
		    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		userService = (UserService)appContext.getBean("userService");
		
	}

}
