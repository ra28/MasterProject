package com.dogAdopter.rest;

import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

import com.dogAdopter.entity.User;

@Path("/userservice")
public class UserRestService extends BaseRestService{
	
	public UserRestService() {
		super();
	}
	
	@GET
	@Path("login/{username}/{password}")
	@Produces(MediaType.APPLICATION_JSON)
	public Object login(@PathParam("username") String username,
					  @PathParam("password") String password) {
 
		 User user = userService.findUserWithUsernameAndPassword(username, password);
		 return JSONObject.stringToValue(user.toString());
	}
	
	@POST
	@Path("userById")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Object getUserById(InputStream incomingData){
		System.out.println("MISA: object: " + incomingData);
		return userService.findUserWithUsernameAndPassword("ana", "ana");
	}

}
