package com.user.controllers;

import com.user.models.User;
import com.user.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserServices services;

    @PostMapping
    public User Create(@RequestBody User user){
        return services.add(user);
    }

    @GetMapping
    public List<User> GetAllUser(){
        return services.getAll();
    }

    @GetMapping("{id}")
    public User getUserById(@PathVariable int id){
        return services.get(id);
    }
}
