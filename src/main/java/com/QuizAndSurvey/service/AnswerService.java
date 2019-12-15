package com.QuizAndSurvey.service;

import com.QuizAndSurvey.model.Answer;

import java.util.List;

public interface AnswerService {

    public Answer saveAnswer(Answer answer);

    List<Answer> getAnswers();

    public Answer getAnswerById(Long id);

//    public void updateAnswer(Answer answer);

}
