package com.androidweb.entity;

import com.androidweb.entity.question.JudgmentQuestion;
import com.androidweb.entity.question.ChoiceQuestion;
import com.androidweb.entity.question.ProgrammingQuestion;
import lombok.Data;

import java.util.List;

@Data
public class TestPaper {
    private List<ProgrammingQuestion> programmingQuestions;
    private List<ChoiceQuestion> choiceQuestions;
    private List<JudgmentQuestion> judgmentQuestions;
}
