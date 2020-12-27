package com.androidweb.repository;

import com.androidweb.entity.question.MultipleChoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultipleChoiceRepository extends JpaRepository<MultipleChoice,Integer> {
}
