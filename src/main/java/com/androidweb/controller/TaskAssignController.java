package com.androidweb.controller;

import com.androidweb.entity.TaskAssign;
import com.androidweb.repository.TaskAssignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/taskAssign")
public class TaskAssignController {
    @Autowired
    private TaskAssignRepository assignRepository;

    /**
     * 注意从前端传参数的时候,可以使用传键-值对的方式，不过需要注意传的时候键的名字要和TaskAssign中对应的参数名一致,值需要String类型的
     * @param task 根据传入的参数自动封装成TaskAssign类
     */
    @PostMapping("/add")
    public void add(@RequestBody TaskAssign task){
        assignRepository.save(task);
    }




}
