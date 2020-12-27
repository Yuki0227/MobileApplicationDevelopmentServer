package com.androidweb.repository;

import com.androidweb.entity.question.ProgrammingQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingQuestionRepository extends JpaRepository<ProgrammingQuestion,Integer> {
}
