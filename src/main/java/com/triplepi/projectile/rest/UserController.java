package com.triplepi.projectile.rest;

import com.triplepi.projectile.models.domain.MesUser;
import com.triplepi.projectile.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/check")
    public Boolean checkByPass(@RequestBody MesUser user) {
        if(user.getJwt().equals(""))
            return userService.checkPassword(user);
        else return userService.checkByJwt(user);
    }

    @GetMapping
    public List<MesUser> getUsers(){
        return userService.getUsers();
    }

    @PostMapping
    public void saveUsers(@RequestBody List<MesUser> users){
        userService.saveUsers(users);
    }
}
