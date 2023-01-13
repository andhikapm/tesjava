package com.tesdatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tesdatabase.entity.User;
import com.tesdatabase.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "/test")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "/add")
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    
    @GetMapping(path = "/all")
    public List<User> getAllUser(){
        return userService.fecthUserList();
    }
}
