package org.fasttrackit.forum;

import main.java.net.parcare.forum.ForumApplication;
import main.java.net.parcare.forum.domain.User;
import main.java.net.parcare.forum.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ttritean
 * @since 11/13/2018
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ForumApplication.class, loader = SpringApplicationContextLoader.class, initializers = ConfigFileApplicationContextInitializer.class)
public class UserIntegrationTest {


    @Autowired
    private UserService userService;



    @Test
    public void testSave() {


        User user = new User();
        user.setUsername ("manhorro");
        user.setFirstName("Horatiu");
        user.setLastName("Mandrutiu");
        userService.saveUser (user);
    }

}
