package com.androidweb.repository;

import com.androidweb.entity.question.JudgmentQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JudgementQuestionRepository extends JpaRepository<JudgmentQuestion,Integer> {

    @Query(nativeQuery=true, value="SELECT * FROM judgment_question ORDER BY RAND() LIMIT ?1")
    List<JudgmentQuestion> findRandomQuestions(Integer Num);

}
