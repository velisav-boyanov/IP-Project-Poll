package com.example.demo.controller;

import com.example.demo.db.models.DbAnswerModel;
import com.example.demo.db.repositories.DbFormRepository;
import com.example.demo.service.AnswerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnsweringFormController {

    @Autowired
    private DbFormRepository formRepository;

    @Autowired
    private AnswerDetailsService answerService;

    @RequestMapping(value = "/add_answer", method = RequestMethod.POST)
    public DbAnswerModel addAnswer(@RequestBody DbAnswerModel answerModel) throws Exception {
        return answerService.addAnswer(answerModel);
    }
}
