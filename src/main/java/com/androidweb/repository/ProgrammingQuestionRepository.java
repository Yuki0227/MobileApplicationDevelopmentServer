package com.androidweb.repository;

import com.androidweb.entity.question.ProgrammingQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProgrammingQuestionRepository extends JpaRepository<ProgrammingQuestion,Integer> {
    @Query(nativeQuery=true, value="SELECT * FROM programming_question ORDER BY RAND() LIMIT ?1")
    List<ProgrammingQuestion> findRandomQuestions(Integer Num);
}
