package java.cz.educanet.twitternt.Resources;

import java.cz.educanet.twitternt.Resources.User;

public class Tweet{
    public String header;
    public User author;
    public String body;
    public int likes;
    public String likedBy;

    public Tweet() {
        this.header = null;
        this.author = null;

        this.body = null;
        this.likes = -1;
        this.likedBy = null;
    }

    public Tweet(String header, User user, String body) {
        this.header = header;
        this.author = user;
        this.body = body;
    }

    public Tweet(String header, User user, String body, int likes, String likedBy) {
        this.header = header;
        this.author = user;
        this.body = body;
        this.likes = likes;
        this.likedBy = likedBy;
    }

}
