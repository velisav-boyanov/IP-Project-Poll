package com.example.demo.service;

import com.example.demo.db.models.DbAnswerModel;
import com.example.demo.db.repositories.DbAnswerRepository;
import org.springframework.stereotype.Service;

@Service
public class AnswerDetailsService {
    private final DbAnswerRepository answerRepository;

    public AnswerDetailsService(DbAnswerRepository dbAnswerRepository) {
        this.answerRepository = dbAnswerRepository;
    }

    public DbAnswerModel addAnswer(DbAnswerModel answer){
        return answerRepository.save(answer);
    }
}
