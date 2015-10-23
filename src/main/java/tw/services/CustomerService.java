package tw.services;

import tw.beans.Customer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("customers")
public class CustomerService {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("text/plain")
    public String register(Customer user) {
        return user.getUsername() + " register success";
    }

    @GET
    @Path("/{id}")
    public String getCustomerDetailInfo(@PathParam("id") Long id) {
        return "Infomation for user with id-" + id;
    }

    @POST
    @Path("/{id}")
    @Consumes("application/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateCustomerDetail(@PathParam("id") Long id, Customer user) {
        return Response.status(200).entity(user).build();
    }


}
