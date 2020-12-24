package com.androidweb.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class TaskAssign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //任务创建者用户ID
    private Integer creatorId;
    //被分配者用户ID
    private Integer assigneeId;
    private String task;
    private Date taskCreateTime;
    private Date taskFinishTime;


}
