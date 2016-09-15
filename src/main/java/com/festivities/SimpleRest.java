package com.festivities;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.festivities.model.Festivity;

@Path("/festivities")
public class SimpleRest {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Festivity getFestivity(Long id) {
        return new Festivity();
    }
}
