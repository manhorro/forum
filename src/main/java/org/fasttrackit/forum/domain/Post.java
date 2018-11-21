package org.fasttrackit.forum.domain;

import java.util.Date;

/**
 * @author ttritean
 * @since 11/20/2018
 */
public class Post {

    private String subject;

    private Date date;

    private User author;


    private String content;


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
