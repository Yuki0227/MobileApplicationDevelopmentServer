package com.androidweb.controller;

import com.androidweb.entity.bbs.Article;
import com.androidweb.entity.bbs.ArticleReview;
import com.androidweb.entity.bbs.ArticleReviewView;
import com.androidweb.entity.bbs.ArticleView;
import com.androidweb.repository.ArticleRepository;
import com.androidweb.repository.ArticleReviewRepository;
import com.androidweb.repository.ArticleReviewViewRepository;
import com.androidweb.repository.ArticleViewRepository;
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

    @Autowired
    ArticleViewRepository articleViewRepository;

    @Autowired
    ArticleReviewViewRepository articleReviewViewRepository;

    @PostMapping("/getArticleById")
    public ArticleView getArticleById(@RequestParam(name = "articleId") Long id) {
        Optional<ArticleView> articles = articleViewRepository.findById(id);
        return articles.get();
    }

    @PostMapping("/getAllArticles")
    public List<ArticleView> getAllArticles() {
        return articleViewRepository.findAll();
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
    public List<ArticleReviewView> getReviews(@RequestParam(name = "articleId") Long articleId) {
        return articleReviewViewRepository.findByArticleId(articleId);
    }

}
