package java.cz.educanet.twitternt;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api") // <-- localhost:8080/[nazevAppky]/api/...
public class ApiConfig extends Application {
}
