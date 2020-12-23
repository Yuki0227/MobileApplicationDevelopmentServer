package com.androidweb.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
public class User {
    @Id
    private Integer id;
    private String name;
    private String password;
    private String content;
}
