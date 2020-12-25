package com.androidweb.controller;

import com.androidweb.entity.TaskAssign;
import com.androidweb.repository.TaskAssignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taskAssign")
public class TaskAssignController {
    @Autowired
    private TaskAssignRepository assignRepository;

    /**
     * 注意从前端传参数的时候,可以使用传键-值对的方式，不过需要注意传的时候键的名字要和TaskAssign中对应的参数名一致,值需要String类型的
     * @param task 根据传入的参数自动封装成TaskAssign类
     * @return 返回添加后的对象
     */
    @PostMapping("/add")
    public TaskAssign add(@RequestBody TaskAssign task){
        return assignRepository.save(task);
    }

    /**
     * 注意在从前端传参数时，注意要注明任务的id号
     * @param task 根据传入的参数自动封装成TaskAssign类
     * @return 返回修改后的对象
     */
    @PostMapping("/update")
    public TaskAssign update(@RequestBody TaskAssign task){
        return assignRepository.save(task);
    }

    /**
     * 根据创建者的id返回他所创建的所有任务
     * @param creatorId 创建任务的那个用户的id
     * @return  返回创建者对应的所有任务
     */
    @PostMapping("/findAll")
    public List<TaskAssign> findTaskAssignByCreatorId(@RequestParam(name = "creatorId") Integer creatorId){
        return assignRepository.findAllByCreatorId(creatorId);
    }


    @PostMapping("/delete")
    public void deleteById(@RequestParam(name = "id") Integer id){
        //System.out.println("id -- >" + id);
        assignRepository.deleteById(id);
    }


}
