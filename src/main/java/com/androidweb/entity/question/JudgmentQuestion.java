package com.androidweb.entity.question;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class JudgmentQuestion {
    @Id
    private Integer id;
    private String question;
    private String choice1;
    private String choice2;
    private String answer;
    private String parse;
    private String type;

}
