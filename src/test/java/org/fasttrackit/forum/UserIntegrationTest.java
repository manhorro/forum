package org.fasttrackit.forum;

import org.fasttrackit.forum.domain.Shop;
import org.fasttrackit.forum.domain.User;
import org.fasttrackit.forum.service.ShopService;
import org.fasttrackit.forum.service.UserService;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.data.domain.Page;
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
        user.setUsername("tania");
        user.setFirstName("Tania");
        user.setLastName("Tritean");
        userService.saveUser(user);

        Page<User> allUsers = userService.getAllUsers(0, 10);
        Assert.assertThat(allUsers.getTotalElements(), Matchers.is(1L));

        //we leave the DB clean so that the next test will not fail
        //(if we do not delete the user it will remain in db and  the above assert with size 1 will fail)
        userService.deleteUser(allUsers.getContent().get(0).getId());
    }

}
