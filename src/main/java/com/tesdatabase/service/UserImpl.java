package com.tesdatabase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tesdatabase.entity.User;
import com.tesdatabase.repository.UserRepo;

@Service
public class UserImpl implements UserService{
    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUser(User user){
        return userRepo.save(user);
    }

    @Override
    public List<User> fecthUserList(){
        return (List<User>) userRepo.findAll();
    }
}
