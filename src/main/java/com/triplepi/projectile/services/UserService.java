package com.triplepi.projectile.services;

import com.triplepi.projectile.models.domain.MesUser;
import com.triplepi.projectile.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Boolean checkPassword(MesUser user) {
        return true;
    }

    public Boolean checkByJwt(MesUser user) {
        return true;
    }

    public void saveUsers(List<MesUser> users) {
        userRepository.saveAll(users);
    }

    public List<MesUser> getUsers() {
        return userRepository.findAll();
    }
}
