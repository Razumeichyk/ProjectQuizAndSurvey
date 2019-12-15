package com.QuizAndSurvey.controller;

import com.QuizAndSurvey.model.Answer;
import com.QuizAndSurvey.model.Question;
import com.QuizAndSurvey.model.Quiz;
import com.QuizAndSurvey.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerService answerService;

    @GetMapping
    public ModelAndView startQuiz(){
        List<Question> questionsForQuiz = questionService.getQuestions();
        List<Answer> answersForQuestion = answerService.getAnswers();
//        Question question = new Question();
//        question.getId();
//        questionsForQuiz.add(question);
        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("questionsForQuiz", questionsForQuiz);
        modelAndView.addObject("displayQuestion", questionsForQuiz.get(2));
        modelAndView.addObject("displayFirstAnswer", answersForQuestion.get(0));
        modelAndView.addObject("displaySecondAnswer", answersForQuestion.get(1));
        modelAndView.addObject("displayThirdAnswer", answersForQuestion.get(2));
        modelAndView.addObject("displayFourthAnswer", answersForQuestion.get(3));
        modelAndView.setViewName("quiz");
        return modelAndView;
    }
}
