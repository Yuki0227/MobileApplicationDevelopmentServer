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

    @PostMapping("/findAll")
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @PostMapping("/findByName")
    public User findByName(@RequestParam(name = "name") String name){
        return  userRepository.findByName(name);
    }

    @PostMapping("/add")
    public User add(@RequestBody User user){
        return userRepository.save(user);
    }


    @PostMapping("/update")
    public User update(@RequestBody User user){
        return userRepository.save(user);
    }


    @PostMapping("/deleteById")
    public void deleteById(@RequestParam(name = "id") Integer id){
        userRepository.deleteById(id);
    }






}
