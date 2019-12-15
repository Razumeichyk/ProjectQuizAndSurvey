package com.QuizAndSurvey.model;

import java.util.Date;
import java.util.List;

public class Survey {

    private Integer id;
    private String title;
    private String description;
    private List<Question> questions;
    private List<Answer> answers;
    private Date creationDate;
}
