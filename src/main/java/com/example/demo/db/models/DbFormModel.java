package com.example.demo.db.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@javax.persistence.Table(name = "Forms")

public class DbFormModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long user_id;
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "form_id", referencedColumnName = "id")
    private List<DbQuestionModel> questions = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "form_id", referencedColumnName = "id")
    private List<DbUserAnswersModel> userAnswers = new ArrayList<>();

    public DbFormModel(long user_id, String name, List<DbQuestionModel> questions, List<DbUserAnswersModel> userAnswers) {
        this.user_id = user_id;
        this.name = name;
        this.questions = questions;
        this.userAnswers = userAnswers;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DbQuestionModel> getQuestions() {
        return questions;
    }

    public void setQuestions(List<DbQuestionModel> questions) {
        this.questions = questions;
    }

    public List<DbUserAnswersModel> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(List<DbUserAnswersModel> userAnswers) {
        this.userAnswers = userAnswers;
    }
}
