package com.androidweb.controller;

import com.androidweb.repository.JudgementQuestionRepository;
import com.androidweb.repository.MultipleChoiceRepository;
import com.androidweb.repository.ProgrammingQuestionRepository;
import com.androidweb.repository.TaskAssignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paper")
public class TestPaperController {

    @Autowired
    private TaskAssignRepository taskAssignRepository;

    @Autowired
    private MultipleChoiceRepository multipleChoiceRepository;

    @Autowired
    private ProgrammingQuestionRepository programmingQuestionRepository;

    @Autowired
    private JudgementQuestionRepository judgementQuestionRepository;




}

