package com.androidweb.entity.bbs;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ArticleReviewView {

    @Id
    private long id;
    private long articleId;
    private String author;
    private String body;

}
