package com.androidweb.entity.question;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class ChoiceQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String que;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;
    private String kind;
    private String type;
    private String source;
    private String answer;
    private String detail;

}
