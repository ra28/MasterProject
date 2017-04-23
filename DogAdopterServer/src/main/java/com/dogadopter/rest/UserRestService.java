package com.dogadopter.rest;

import org.hibernate.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dogadopter.entity.User;
import com.dogadopter.service.UserService;

public class UserRestService {
	
	Session session;
	Transaction transaction;
	
	public boolean loginViaApp(String username, String password){
		try
		{
			ApplicationContext appContext =
			    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
			UserService service =  (UserService)appContext.getBean("userService");
			User user = service.findUserWithUsernameAndPassword(username, password);
			if(user == null){
				return false;
			}
			return true;	
		}
		catch(Exception e)
		{
			e.printStackTrace(); 
		}
		return false;
	}

}
