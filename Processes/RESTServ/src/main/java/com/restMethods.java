package com;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/restser")
@Produces("text/xml")
public class restMethods {

    public restObj retobj = new restObj();

    @GET
    @Path("{tag}")
    public restObj getpkgStatus(@PathParam("tag") int tag) {
        return new restObj(tag);
    }


}
