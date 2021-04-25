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

    private String name;
    private String uuid;
    private String question;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "form_id", referencedColumnName = "id")
    private List<DbUserAnswersModel> userAnswers = new ArrayList<>();

    public DbFormModel(String uuid, String name, String question, List<DbUserAnswersModel> userAnswers) {
        this.name = name;
        this.question = question;
        this.userAnswers = userAnswers;
        this.uuid = uuid;
    }

    public DbFormModel() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuestions() {
        return question;
    }

    public void setQuestions(String questions) {
        this.question = questions;
    }

    public List<DbUserAnswersModel> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(List<DbUserAnswersModel> userAnswers) {
        this.userAnswers = userAnswers;
    }
}
