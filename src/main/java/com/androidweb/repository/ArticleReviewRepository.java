package com.androidweb.repository;

import com.androidweb.entity.bbs.ArticleReview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleReviewRepository extends JpaRepository<ArticleReview,Long> {
    public List<ArticleReview> findByArticleId(Long id);
}
