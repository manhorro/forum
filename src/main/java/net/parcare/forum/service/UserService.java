package net.parcare.forum.service;

import net.parcare.forum.domain.User;
import net.parcare.forum.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) throws IllegalArgumentException {
        if (user.getUsername() == null) {
            throw new IllegalArgumentException("Username can not be null");
        }
        if (user.getFirstName() == null) {
            throw new IllegalArgumentException("First name can nor be null");
        }
        if (user.getLastName() == null) {
            throw new IllegalArgumentException("Last name can not be null");
        }
        if (user.getAge() < 18 || user.getAge() > 80) {
            throw new IllegalArgumentException("Your age is not proper for this site");
        }
        if (user.getSex() == null) {
            throw new IllegalArgumentException("You must select one option");
        }
        if (user.getPhone() == null) {
            throw new IllegalArgumentException("Phone number can not be null");
        }
        try {
            userRepository.save(user);
        } catch (Exception e) {
            System.out.println("Error when saving user" + e);
        }
    }

    public Page<User> getAllUsers(int page, int size) {
        //TODO - add validation, exceptions etc
        Pageable pageable = new PageRequest(page, size);
        return userRepository.findAll(pageable);
    }


    public User getUser(long userId) {
        //TODO - add validation, exceptions etc

        return userRepository.findOne(userId);
    }

    public void deleteUser(long userId) throws IllegalArgumentException {
        //TODO - add validation, exceptions etc
        try {
            userRepository.delete(userRepository.findOne(userId));
        } catch (Exception e) {
            System.out.println("Error deleting the user:" + e);
        }
        System.out.println("User deleted!");
    }
