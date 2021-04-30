package educanet.Resources;

import educanet.Manager.UserManager;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("users")
@Produces(MediaType.APPLICATION_JSON)

public class UserResources {

    @Inject
    private UserManager Users;

    @GET
    @Path("")
    public Response getAll() {
        return Response.ok(Users.getUsers()).build();
    }

    @GET
    @Path("user")
    public Response getSpecific(int id) {
        return Response.ok(Users.getSpecificUser(id)).build();
    }

    @POST
    @Path("create")
    public Response create(User User) {
        Users.putUser(User);
        return Response.ok(User).build();
    }

    @PUT
    @Path("create")
    public Response edit(User User) {
        Users.editUser(User.getId(),User);
        return Response.ok(User).build();
    }

    @DELETE
    @Path("delete")
    public Response delete(int id) {
        Users.delete(id);
        return Response.ok().build();
    }
}
