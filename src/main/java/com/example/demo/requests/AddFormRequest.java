package com.example.demo.requests;

import com.example.demo.db.models.DbUserAnswersModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AddFormRequest implements Serializable {

    private long id;
    private long userId;
    private String name;
    private String questions;
    private List<DbUserAnswersModel> userAnswers = new ArrayList<>();

    public AddFormRequest(){}

    public AddFormRequest(long userId, String name, String questions, List<DbUserAnswersModel> userAnswers) {
        this.userId = userId;
        this.name = name;
        this.questions = questions;
        this.userAnswers = userAnswers;
    }

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public List<DbUserAnswersModel> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(List<DbUserAnswersModel> userAnswers) {
        this.userAnswers = userAnswers;
    }
}
