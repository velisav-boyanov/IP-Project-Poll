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
public class ReadingFormController {
    @Autowired
    private DbFormRepository formRepository;

    @Autowired
    private AnswerDetailsService answerService;

    @RequestMapping(value = "/get_answers", method = RequestMethod.GET)
    public DbAnswerModel getAnswers(long form_id) throws Exception {
        return answerService.getAnswers(form_id);
    }
}
