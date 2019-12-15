package com.QuizAndSurvey.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
public class Question implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private Integer pointsForCorrectAnswer;
    private  boolean active;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
    private List<Answer> answers;

    public Question() {
    }

    public Question(Long id){
        this.id = id;
    }

    public Question(Long id, String content, boolean active, List<Answer> answers){
        this.id = id;
        this.content = content;
        this.active = active;
        this.answers = answers;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPointsForCorrectAnswer() {
        return pointsForCorrectAnswer;
    }

    public void setPointsForCorrectAnswer(Integer pointsForCorrectAnswer) {
        this.pointsForCorrectAnswer = pointsForCorrectAnswer;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return content;
    }

}
