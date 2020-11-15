package com.emilija.final_project.controllers;

import com.emilija.final_project.model.User;
import com.emilija.final_project.repositories.RoleRepository;
import com.emilija.final_project.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UsersRestController extends ApiRestController {
    private final UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @GetMapping("/users")
    List<User> getAllUsers(
            @RequestParam(required = false) String username,
            @RequestParam(required = false) String password
    ) {
        if (username != null && !username.isEmpty()) {
            return this.userRepository.findAllByUsername(username);
        }

        if (password != null && !password.isEmpty()) {
            return this.userRepository.findAllByPassword(password);
        }

        return userRepository.findAll();
    }

    @PostMapping("/users")
    User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/users/{id}")
    Optional<User> getUserById(@PathVariable Long id) {
        return this.userRepository.findById(id);
    }

    @PutMapping("/users/{id}")
    User updateUserById(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return this.userRepository.save(user);
    }
}


