package com.androidweb.entity.question;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ProgrammingQuestion {
    @Id
    private long id;
    private String question;
    private String input;
    private String output;
    private String sampleInput;
    private String sampleOutput;
}
