package net.parcare.forum.domain;

import com.sun.istack.internal.Nullable;

import javax.persistence.*;


@Entity
@Table(name="users_forum")
public class User {

    @Id
    @GeneratedValue(generator = "forum_generator")
    @SequenceGenerator(
            name = "forum_generator",
            sequenceName = "forum_sequence",
            initialValue = 1
    )
    private long id;

    @Column(name="user_name",unique=true)
    private String username;
    @Column(nullable = true)
    private String firstName;
    @Column(nullable = true)
    private String lastName;

    @Column(nullable = true)
    private int age;
    @Column(nullable = true)
    private String sex;
    @Column(nullable = true)
    private String phone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
