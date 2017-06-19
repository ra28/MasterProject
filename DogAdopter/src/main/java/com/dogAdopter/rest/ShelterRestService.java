package com.dogAdopter.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dogAdopter.entity.Shelter;
import com.dogAdopter.service.ShelterService;


@Path("/shelterservice")
public class ShelterRestService {
	
	ApplicationContext appContext =
	    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
	ShelterService shelterService = (ShelterService)appContext.getBean("shelterService");
	
	@GET
	@Path("getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public Object getAll() {
 
		 List<Shelter> shelters = shelterService.getAll();
		 return JSONObject.wrap(shelters);
	}

}
