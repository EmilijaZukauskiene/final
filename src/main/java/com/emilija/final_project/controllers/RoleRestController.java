package com.emilija.final_project.controllers;

import com.emilija.final_project.model.Role;
import com.emilija.final_project.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.relation.RoleInfoNotFoundException;

@RestController
public class RoleRestController {

    @Autowired
    private RoleRepository roleRepository;

    @PostMapping("/addrole")
    public void saveRole(@RequestBody Role role) {
        roleRepository.save(role);
    }
}

