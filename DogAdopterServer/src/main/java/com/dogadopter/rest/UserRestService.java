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
	
	public boolean registerUser(User user){
		
		ApplicationContext appContext =
		    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		UserService service =  (UserService)appContext.getBean("userService");
		if(user == null){
			return false;
		}
		service.save(user);
		return true;	
	}
	public boolean updateUser(User user){
		
		ApplicationContext appContext =
		    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		UserService service =  (UserService)appContext.getBean("userService");
		if(user == null){
			return false;
		}
		service.update(user);
		return true;	
	}
	
	public boolean removeUser(User user){
		
		ApplicationContext appContext =
		    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		UserService service =  (UserService)appContext.getBean("userService");
		if(user == null){
			return false;
		}
		service.delete(user);
		return true;	
	}

}
