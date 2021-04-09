package educanet.Manager;

import educanet.Resources.User;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;


@ApplicationScoped


public class UserManager {

    ArrayList<User> Group = new ArrayList<User>();

    public void putuser(User User) {
        User.setId(Group.size() + 1);
        Group.add(User);
    }

    public ArrayList<User> getUsers() {
        return Group;
    }

    public User getspecificuser(int id) {

        return(Group.get(id));
    }

    public void delete(int removeid) {
        Group.remove(removeid - 1);
    }
}
