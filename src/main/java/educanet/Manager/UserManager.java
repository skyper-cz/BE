package educanet.Manager;

import educanet.Resources.User;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.HashMap;


@ApplicationScoped


public class UserManager {

    HashMap<Integer, User> Group = new HashMap<>();
    int id = 0;

    public void putUser(User User) {
        User.setId(id);
        Group.put(id, User);
        id++;
    }

    public HashMap<Integer, User> getUsers() {
        return Group;
    }

    public User getSpecificUser(int id) {
        return(Group.get(id));
    }

    public void delete(int removeId) {
        Group.remove(removeId);
    }
}
