package com.androidweb.entity.question;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class MultipleChoice {
    @Id
    private Integer id;
    private String problem;
    private String a;
    private String b;
    private String c;
    private String d;
    private String answer;
    private String parse;
}
