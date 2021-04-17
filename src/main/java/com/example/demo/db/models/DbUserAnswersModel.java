package com.example.demo.db.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name = "User_Answers")
public class DbUserAnswersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int index;
    private long form_id;
    private long question_id;

    public DbUserAnswersModel(int index, long form_id, long question_id) {
        this.index = index;
        this.form_id = form_id;
        this.question_id = question_id;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public long getForm_id() {
        return form_id;
    }

    public void setForm_id(long form_id) {
        this.form_id = form_id;
    }

    public long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(long question_id) {
        this.question_id = question_id;
    }
}
