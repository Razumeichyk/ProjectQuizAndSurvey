package com.QuizAndSurvey.service;


import com.QuizAndSurvey.model.Answer;
import com.QuizAndSurvey.model.Question;
import com.QuizAndSurvey.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> getQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question saveQuestion(Question question){
        return questionRepository.save(question);
    }

    @Override
    public void deleteQuestion(Question question) {
        questionRepository.delete(question);
    }

    @Override
    public Question getQuestionById(Long id) {
            return questionRepository.findById(id).orElse(null);
    }

    @Override
    public Question createQuestionWithAnswers(List<Answer> answersToQuestion) {

        return null;
    }
}
