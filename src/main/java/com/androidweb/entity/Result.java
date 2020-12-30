package com.androidweb.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Result {
    @Id
    private int id;
    private String title;
    private String date;
    private String time;
    private String score;
}
