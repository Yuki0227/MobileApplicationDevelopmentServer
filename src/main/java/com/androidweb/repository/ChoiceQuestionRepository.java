package com.androidweb.repository;

import com.androidweb.entity.question.ChoiceQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChoiceQuestionRepository extends JpaRepository<ChoiceQuestion,Integer> {


    @Query(nativeQuery=true, value="SELECT * FROM choice_question ORDER BY RAND() LIMIT ?1")
    List<ChoiceQuestion> findRandomQuestions(Integer Num);
}
