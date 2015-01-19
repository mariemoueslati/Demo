package com.ardia.DemoArdiaPFEEJB.ws;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Session Bean implementation class RestTest
 */
@Stateless
@LocalBean
@Path("/service")
public class RestTest  {

    /**
     * Default constructor. 
     */
    public RestTest() {
        // TODO Auto-generated constructor stub
    }
    
    @Path("/sayHello")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello(@QueryParam("name")String name){
    	return " bonjour , "+name;
    }
    

}
