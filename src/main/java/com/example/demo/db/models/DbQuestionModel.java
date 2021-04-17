package com.example.demo.db.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@javax.persistence.Table(name = "Questions")
public class DbQuestionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long form_id;
    private String descript;
    private boolean singleAnswer;
    private boolean optional;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    private List<DbAnswerModel> answers = new ArrayList<>();

    public DbQuestionModel(long form_id, String descript, boolean singleAnswer, boolean optional, List<DbAnswerModel> answers) {
        this.form_id = form_id;
        this.descript = descript;
        this.singleAnswer = singleAnswer;
        this.optional = optional;
        this.answers = answers;
    }

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

    public boolean isSingleAnswer() {
        return singleAnswer;
    }

    public void setSingleAnswer(boolean singleAnswer) {
        this.singleAnswer = singleAnswer;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    public List<DbQuestionModel> getAnswers() {
        return answers;
    }

    public void setAnswers(List<DbQuestionModel> answers) {
        this.answers = answers;
    }
}
