package posts.Resources;

import posts.Manager.PostManager;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("Posts")
@Produces(MediaType.APPLICATION_JSON)

public class PostResources {

    @Inject
    private PostManager Posts;

    @GET
    @Path("get-all")
    public Response getAll() {
        return Response.ok(Posts.getPosts()).build();
    }

    @GET
    @Path("get-specific")
    public Response getSpecific(@QueryParam("id") int id) {
        return Response.ok(Posts.getspecificPost(id)).build();
    }

    @POST
    @Path("create")
    public Response create(Post Post) {
        Posts.putPost(Post);
        return Response.ok(Post).build();
    }

    @DELETE
    @Path("delete")
    public Response delete(@QueryParam("id") int removeid) {
        Posts.delete(removeid);
        return Response.ok().build();
    }
}
