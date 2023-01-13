package com.tesdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tesdatabase.entity.Address;

public interface AddressRepo extends JpaRepository <Address, Long>{
    
}
