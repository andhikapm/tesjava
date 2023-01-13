package com.tesdatabase.service;

import java.util.List;

import com.tesdatabase.entity.User;

public interface UserService {
    
    User saveUser(User user);

    List<User> fecthUserList();
}
