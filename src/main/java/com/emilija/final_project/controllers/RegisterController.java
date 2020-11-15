package com.emilija.final_project.controllers;

import com.emilija.final_project.model.Role;
import com.emilija.final_project.model.User;
import com.emilija.final_project.repositories.RoleRepository;
import com.emilija.final_project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegisterController {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/")
    public String index() {
        return "Hello, welcome!";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/register")
    public User doRegister(@RequestBody User user) {
        //password encryption
        //move to service layer
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        Role role = new Role();
        role.setName("USER");
        role.setUser(user);
        user.setRole(role);

        return userRepository.save(user);
    }
}
