package com.androidweb.entity.bbs;

import lombok.Data;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class ArticleReview {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long articleId;
  private long userId;
  private String body;

}
