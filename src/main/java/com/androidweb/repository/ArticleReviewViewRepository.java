package com.androidweb.repository;

import com.androidweb.entity.bbs.ArticleReviewView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleReviewViewRepository extends JpaRepository<ArticleReviewView, Long> {
    List<ArticleReviewView> findByArticleId(Long id);
}
