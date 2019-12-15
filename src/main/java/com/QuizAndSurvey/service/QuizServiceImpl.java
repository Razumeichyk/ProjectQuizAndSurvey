package com.QuizAndSurvey.service;

import com.QuizAndSurvey.model.Question;
import com.QuizAndSurvey.model.Quiz;
import com.QuizAndSurvey.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionService questionService;

    @Override
    public List<Quiz> getQuizzes() {
        return quizRepository.findAll();
    }

//    @Override
//    public createFirstQuiz() {
//        List<Question> questionsForFirstQuiz = new ArrayList<>();
//        Question question = new Question();
//        question.getId();
//        questionsForFirstQuiz.add(question);
//    }
}
