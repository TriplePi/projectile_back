package com.triplepi.projectile.rest;

import com.triplepi.projectile.models.domain.MesUser;
import com.triplepi.projectile.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public Boolean checkByPass(@RequestBody MesUser user) {
        return userService.checkPassword(user);
    }

    @PostMapping
    public Boolean checkByJwt(@RequestBody MesUser user){
        return userService.checkByJwt(user);
    }
}
