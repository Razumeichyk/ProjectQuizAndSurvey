package com.QuizAndSurvey.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Quiz implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String surveyTitle;
    private String description;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Question> questionsId;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Answer> answersId;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Answer> correctAnswers;
    private Date creationDate;
}
