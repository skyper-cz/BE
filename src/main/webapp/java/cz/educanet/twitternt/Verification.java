package java.cz.educanet.twitternt;

import java.cz.educanet.twitternt.Resources.LoginDatabase;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("verified")
public class Verification {
    @GET
    public Response isVerified(@QueryParam("user") String username, @QueryParam("pass") String password) {
        for (int i = 0; i < LoginDatabase.userList.size(); i++) {
            if (LoginDatabase.userList.get(i).password.equals(password) && LoginDatabase.userList.get(i).username.equals(username))
                return Response.ok(LoginDatabase.userList.get(i).verified).build();
        }
        return Response.status(404, "This combination of username and password does not exist.").build();
    }

    @PUT
    public Response changeVerification(@QueryParam("user") String username, @QueryParam("pass") String password, @QueryParam("new") boolean setto) {
        for (int i = 0; i < LoginDatabase.userList.size(); i++) {
            if (LoginDatabase.userList.get(i).password.equals(password) && LoginDatabase.userList.get(i).username.equals(username)) {
                LoginDatabase.userList.get(i).verified = true;
                return Response.ok(LoginDatabase.userList.get(i).verified).build();
            }
        }
        return Response.status(404, "This combination of username and password does not exist.").build();
    }
}
