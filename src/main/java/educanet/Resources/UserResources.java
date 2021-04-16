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
    @Path("get-all")
    public Response getAll() {
        return Response.ok(Users.getUsers()).build();
    }

    @GET
    @Path("get-specific")
    public Response getSpecific(@QueryParam("id") int id) {
        return Response.ok(Users.getSpecificUser(id)).build();
    }

    @POST
    @Path("create")
    public Response create(User User) {
        Users.putUser(User);
        return Response.ok(User).build();
    }

    @DELETE
    @Path("delete")
    public Response delete(@QueryParam("id") int removeId) {
        Users.delete(removeId);
        return Response.ok().build();
    }
}
