package org.fasttrackit.forum.service;

import main.java.net.parcare.forum.domain.User;
import main.java.net.parcare.forum.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        if (user.getUsername() == null) {
            throw new IllegalArgumentException("Username can not be null");
        }
        if (user.getLastName() == null) {
            throw new IllegalArgumentException("Last name can not be null");
        }
        try {
            userRepository.save(user);
        } catch (Exception e) {
            System.out.println("Error when saving user" + e);
        }
    }
}
