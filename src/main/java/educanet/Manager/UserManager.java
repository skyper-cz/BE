package educanet.Manager;

import educanet.Resources.User;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;


@ApplicationScoped


public class UserManager {

    ArrayList<User> Group = new ArrayList<User>();
    int id = 0;

    public void putUser(User User) {
        User.setId(id++);
        Group.add(User);
    }

    public ArrayList<User> getUsers() {
        return Group;
    }

    public User getSpecificUser(int id) {

        return(Group.get(id));
    }

    public void delete(int removeid) {
        Group.remove(removeid - 1);
    }
}
