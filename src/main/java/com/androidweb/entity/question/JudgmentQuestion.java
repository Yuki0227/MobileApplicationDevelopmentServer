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
    private boolean answer;
    private String parse;

}
