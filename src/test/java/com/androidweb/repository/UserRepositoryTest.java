package com.androidweb.repository;

import com.androidweb.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private  UserRepository userRepository;

    @Test
    void findAll(){
        System.out.println(userRepository.findAll());
    }

    @Test
    void addUser(){
        User user = new User();
        user.setName("Zhang");
        user.setPassword("123123");
        userRepository.save(user);
    }

    @Test
    void updateUser(){
        User user = new User();
        user.setId(3);
        user.setName("cch");
        user.setPassword("12341230");
        userRepository.save(user);
    }

    @Test
    void findUserById(){
        Optional<User> byId = userRepository.findById(1);
        System.out.println("byId -- > " + byId);
    }

    @Test
    void findUserByName(){
        User user = userRepository.findByName("Zhang");
        System.out.println("user -- >" + user);
    }

}