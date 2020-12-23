package com.androidweb.controller;

import com.androidweb.entity.User;
import com.androidweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    private User user;


    @GetMapping("/findAll")
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/findByName/{name}")
    public User findByName(@PathVariable("name") String name){
        return  userRepository.findByName(name);
    }

    @GetMapping("/save")
    public String save(@RequestBody User user){
        User result = userRepository.save(user);
        if(result!=null){
            return "success";
        }else {
            return "error";
        }
    }


}
