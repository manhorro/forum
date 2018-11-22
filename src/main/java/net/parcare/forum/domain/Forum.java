package main.java.net.parcare.forum.domain;

import java.util.ArrayList;
import java.util.List;


public class Forum {

    private String name;

    private List<main.java.net.parcare.forum.domain.Post> posts = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<main.java.net.parcare.forum.domain.Post> getPosts() {
        return posts;
    }

    public void setPosts(List<main.java.net.parcare.forum.domain.Post> posts) {
        if (posts == null) {
            throw new IllegalArgumentException("You are not allowed" +
                    " to set the list to null");
        }
        this.posts = posts;
    }
}
