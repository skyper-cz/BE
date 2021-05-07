package educanet.Resources;

public class User {

    private int id;
    private String username;
    private String password;
    private String name;
    private String description;
    private String skills;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

