package com.tesdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tesdatabase.entity.User;

public interface UserRepo extends JpaRepository <User, Long>{
    
}
