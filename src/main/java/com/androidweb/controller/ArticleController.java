package com.androidweb.controller;

import com.androidweb.entity.bbs.Article;
import com.androidweb.entity.bbs.ArticleReview;
import com.androidweb.repository.ArticleRepository;
import com.androidweb.repository.ArticleReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bbs")
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    ArticleReviewRepository articleReviewRepository;

    @PostMapping("/getArticleById")
    public Article getArticleById(@RequestParam(name = "articleId") Long id){
        Optional<Article> articles = articleRepository.findById(id);
        return articles.get();
    }

    @PostMapping("/getAllArticles")
    public List<Article> getAllArticles(){
        return articleRepository.findAll();
    }

    @PostMapping("/putArticle")
    public Article putArticle(@RequestBody Article article){
        return articleRepository.save(article);
    }

    @PostMapping("/putArticleReview")
    public ArticleReview putArticleReview(@RequestBody ArticleReview articleReview){
        return articleReviewRepository.save(articleReview);
    }


    @PostMapping("/getReviews")
    public List<ArticleReview> getReviews(@RequestParam(name = "articleId") Long articleId){
        return articleReviewRepository.findByArticleId(articleId);
    }

}
