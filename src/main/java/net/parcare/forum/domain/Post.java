package main.java.net.parcare.forum.domain;

import java.util.Date;


public class Post {

    private String subject;

    private Date date;

    private main.java.net.parcare.forum.domain.User author;


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

    public main.java.net.parcare.forum.domain.User getAuthor() {
        return author;
    }

    public void setAuthor(main.java.net.parcare.forum.domain.User author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
