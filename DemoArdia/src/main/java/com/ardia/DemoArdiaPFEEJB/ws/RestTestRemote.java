package com.ardia.DemoArdiaPFEEJB.ws;

import javax.ejb.Remote;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Remote
@Path("/ws/test")
public interface RestTestRemote {
	@GET
	@Path("/hello")
	@Produces("application/json")
    public String sayHello(@QueryParam("name")String name);
	//kjhdkjh
}
