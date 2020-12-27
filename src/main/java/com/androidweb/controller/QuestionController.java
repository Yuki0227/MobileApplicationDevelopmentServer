package com.androidweb.controller;


import com.androidweb.entity.Question;
import com.androidweb.entity.User;
import com.androidweb.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question")
public class QuestionController {


    @Autowired
    private QuestionRepository questionRepository;

    @PostMapping("/find")
    public Question findById(@RequestParam(name = "id") Integer id){
        Question question = questionRepository.findById(id).get();
        return question;
    }
}
