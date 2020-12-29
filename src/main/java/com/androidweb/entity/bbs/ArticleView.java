package com.androidweb.entity.bbs;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ArticleView {

    @Id
    private long id;
    private String author;
    private String title;
    private String body;

}
