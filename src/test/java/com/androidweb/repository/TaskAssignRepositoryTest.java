package com.androidweb.repository;

import com.androidweb.entity.TaskAssign;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;

@SpringBootTest
public class TaskAssignRepositoryTest {
    @Autowired
    TaskAssignRepository taskAssignRepository;

    @Test
    void add(){
        TaskAssign taskAssign = new TaskAssign();
        taskAssign.setTask("任务计划:测试工作2");
        taskAssign.setCreatorId(2);
        Date createTime = new Date(System.currentTimeMillis());
        taskAssign.setTaskCreateTime(createTime);
        taskAssignRepository.save(taskAssign);
    }

}
