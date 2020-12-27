package com.androidweb.entity.question;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ProgrammingQuestion {
    @Id
    private Integer id;
    private String description;
    private String input;
    private String output;
    private String sample_input;
    private String sample_output;
}
