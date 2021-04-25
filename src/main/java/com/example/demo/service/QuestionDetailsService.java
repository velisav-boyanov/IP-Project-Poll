package com.example.demo.service;

import com.example.demo.db.models.DbQuestionModel;
import com.example.demo.db.repositories.DbQuestionRepository;
import org.springframework.stereotype.Service;

@Service
public class QuestionDetailsService {
    private final DbQuestionRepository questionRepository;

    public QuestionDetailsService(DbQuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public DbQuestionModel addQuestion(DbQuestionModel question){
        return questionRepository.save(question);
    }
}
