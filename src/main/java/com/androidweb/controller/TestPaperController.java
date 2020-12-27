package com.androidweb.controller;

import com.androidweb.entity.Question;
import com.androidweb.entity.TestPaper;
import com.androidweb.repository.JudgementQuestionRepository;
import com.androidweb.repository.ChoiceQuestionRepository;
import com.androidweb.repository.ProgrammingQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paper")
public class TestPaperController {


    @Autowired
    private ChoiceQuestionRepository choiceQuestionRepository;

    @Autowired
    private ProgrammingQuestionRepository programmingQuestionRepository;

    @Autowired
    private JudgementQuestionRepository judgementQuestionRepository;


    @PostMapping("/getTestPaper")
    public TestPaper getTestPaper(
            @RequestParam(name = "choiceQuestion") Integer choiceQuestionNumber,
            @RequestParam(name = "programmingQuestion") Integer programmingQuestionNumber,
            @RequestParam(name = "judgementQuestion") Integer judgementQuestionNumber
    ){
        TestPaper testPaper = new TestPaper();
        testPaper.setChoiceQuestions(choiceQuestionRepository.findRandomQuestions(choiceQuestionNumber));
        testPaper.setJudgmentQuestions(judgementQuestionRepository.findRandomQuestions(judgementQuestionNumber));
        testPaper.setProgrammingQuestions(programmingQuestionRepository.findRandomQuestions(programmingQuestionNumber));
        return testPaper;
    }

}

