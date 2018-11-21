package org.fasttrackit.forum.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ttritean
 * @since 11/20/2018
 */
public class Forum {

    private String name;

    private List<Post> posts = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        if (posts == null) {
            throw new IllegalArgumentException("You are not allowed" +
                    " to set the list to null");
        }
        this.posts = posts;
    }
}
