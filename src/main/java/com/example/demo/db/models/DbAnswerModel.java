package com.example.demo.db.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name = "Answers")
public class DbAnswerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long question_id;
    private String descript;

    public DbAnswerModel(long question_id, String descript) {
        this.question_id = question_id;
        this.descript = descript;
    }

    public long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(long question_id) {
        this.question_id = question_id;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }
}
