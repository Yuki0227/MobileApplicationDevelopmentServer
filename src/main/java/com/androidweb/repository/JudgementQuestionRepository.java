package com.androidweb.repository;

import com.androidweb.entity.question.JudgmentQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JudgementQuestionRepository extends JpaRepository<JudgmentQuestion,Integer> {
}
