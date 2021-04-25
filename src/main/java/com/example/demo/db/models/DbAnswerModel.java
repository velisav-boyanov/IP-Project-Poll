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

    private long form_id;
    private String descript;

    public DbAnswerModel(long form_id, String descript) {
        this.form_id = form_id;
        this.descript = descript;
    }

    public DbAnswerModel() {}

    public long getForm_id() {
        return form_id;
    }

    public void setForm_id(long form_id) {
        this.form_id = form_id;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }
}
