package com.androidweb.controller;


import com.androidweb.entity.Result;
import com.androidweb.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/result")
public class ResultController {
    @Autowired
    private ResultRepository resultRepository;


    @PostMapping("/findAll")
    public List<Result> findAll(){return resultRepository.findAll();}

    @PostMapping("/add")
    public Result add(
            @RequestParam(name = "title") String title,
            @RequestParam(name = "date") String date,
            @RequestParam(name = "time") String time,
            @RequestParam(name = "score") String score
    ){
        Result result = new Result();
        result.setTitle(title);
        result.setDate(date);
        result.setTime(time);
        result.setScore(score);
        return  resultRepository.save(result);
    }

}
