package net.parcare.forum.web;

import net.parcare.forum.domain.User;
import net.parcare.forum.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/{userId}"}, method = RequestMethod.GET)
    public User findUser(@PathVariable("userId") Long userId) {
        LOGGER.info("userId >> {}", userId);

        //TODO - convert entity to resource - peste 2 laburi vorbim depsre asta
        return userService.getUser(userId);
    }

}
