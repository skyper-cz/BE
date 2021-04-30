package java.cz.educanet.twitternt.Resources;

public class User {

    public String username;
    public String password;
    public boolean verified;

    public User() {
        this.username = null;
        this.password = null;
        this.verified = false;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.verified = false;
    }

    public User(String username, String password, boolean verified) {
        this.username = username;
        this.password = password;
        this.verified = verified;
    }
}
