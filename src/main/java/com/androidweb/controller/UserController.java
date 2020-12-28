package com.androidweb.controller;

import com.androidweb.entity.User;
import com.androidweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;


    @PostMapping("/findAll")
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @PostMapping("/find")
    public User find(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "password") String password
    ){
        User user = userRepository.findByNameAndPassword(name, password);
        user.setPassword("");
        return user;
    }

    @PostMapping("/findById")
    public User findById(
            @RequestParam(name = "id") Integer id
    ){
        Optional<User> users = userRepository.findById(id);
        User user = users.get();
        user.setPassword("");
        return user;
    }



    @PostMapping("/add")
    public User add(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "password") String password
    ){
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        return userRepository.save(user);
    }


    @PostMapping("/update")
    public User update(@RequestBody User user){
        return userRepository.save(user);
    }


    @PostMapping("/delete")
    public void deleteById(@RequestParam(name = "id") Integer id){
        userRepository.deleteById(id);
    }






}
