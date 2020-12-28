package com.androidweb.controller;

import com.androidweb.entity.bbs.Article;
import com.androidweb.entity.bbs.ArticleReview;
import com.androidweb.repository.ArticleRepository;
import com.androidweb.repository.ArticleReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bbs")
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    ArticleReviewRepository articleReviewRepository;

    @PostMapping("/getAllArticles")
    public List<Article> getAllArticles(){
        return articleRepository.findAll();
    }

    @PostMapping("/getReviews")
    public List<ArticleReview> getReviews(@RequestParam(name = "articleId") Long articleId){
        return articleReviewRepository.findByArticleId(articleId);
    }

}
