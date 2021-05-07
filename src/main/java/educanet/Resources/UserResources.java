package educanet.Resources;

import educanet.Manager.UserManager;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Locale;

@Path("users")
@Produces(MediaType.APPLICATION_JSON)

public class UserResources {

    @Inject
    private UserManager userManager;

    @GET
    @Path("")
    public Response getAllUsers() {
        return Response.ok(userManager.getUsers()).build();
    }

    @GET
    @Path("user")
    public Response getOneUser(int id) {
        return Response.ok(userManager.getSpecificUser(id)).build();
    }

    @POST
    @Path("create")
    public Response create(User user) {
        if (user.getUsername().toLowerCase(Locale.ROOT).equals("teapot")) return Response.status(418, "I am the only teapot here!").build(); // Easter egg
        for (int i = 0; i < userManager.getMapSize(); i++) {
            if (userManager.getSpecificUser(i).getUsername().equals(user.getUsername()))
                return Response.status(409, "This username already exists.").build();
        }
        userManager.putUser(user);
        return Response.ok(user).build();
    }

    @PUT
    @Path("create")
    public Response edit(User user) {
        if (user.getUsername().toLowerCase(Locale.ROOT).equals("teapot")) return Response.status(418, "I am the only teapot here!").build(); // Easter egg
        for (int i = 0; i < userManager.getMapSize(); i++) {
            if (userManager.getSpecificUser(i).getUsername().equals(user.getUsername()))
                return Response.status(409, "This username already exists.").build();
        }
        userManager.editUser(user.getId(), user);
        return Response.ok(user).build();
    }

    @DELETE
    @Path("delete")
    public Response delete(int id) {
        userManager.delete(id);
        return Response.ok().build();
    }
}
