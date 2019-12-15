package com.QuizAndSurvey.service;

import com.QuizAndSurvey.model.Answer;
import com.QuizAndSurvey.model.Question;

import java.util.List;

public interface QuestionService {

    List<Question> getQuestions();

    public Question saveQuestion(Question question);

    public void deleteQuestion(Question question);

    public Question getQuestionById(Long id);

    public Question createQuestionWithAnswers(List<Answer> answersToQuestion);

}
