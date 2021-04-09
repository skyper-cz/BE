package posts.Manager;

import posts.Resources.Post;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;


@ApplicationScoped


public class PostManager {

    ArrayList<Post> Group = new ArrayList<Post>();

    public void putPost(Post post) {
        post.setId(Group.size() + 1);
        Group.add(post);
    }

    public ArrayList<Post> getPosts() {
        return Group;
    }

    public Post getspecificPost(int id) {

        return(Group.get(id));
    }

    public void delete(int removeid) {
        Group.remove(removeid - 1);
    }
}
