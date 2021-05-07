package educanet.Manager;

import educanet.Resources.User;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;


@ApplicationScoped


public class UserManager {

    HashMap<Integer, User> userHashMap = new HashMap<>();
    int id = 0;

    public int getMapSize() {
        return userHashMap.size();
    }

    public void putUser(User User) {
        User.setId(id);
        userHashMap.put(id, User);
        id++;
    }

    public void editUser(int id, User user) {
        userHashMap.put(id, user);
    }

    public HashMap<Integer, User> getUsers() {
        return userHashMap;
    }

    public User getSpecificUser(int id) {
        return (userHashMap.get(id));
    }

    public void delete(int removeId) {
        userHashMap.remove(removeId);
    }
}
