package com.androidweb.repository;

import com.androidweb.entity.bbs.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Integer> {

}
