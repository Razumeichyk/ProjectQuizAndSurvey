package com.QuizAndSurvey.controller;

import com.QuizAndSurvey.model.Question;
import com.QuizAndSurvey.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping
    public ModelAndView getQuestions(){
        List<Question> questionsList = questionService.getQuestions();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("questions", questionsList);
        modelAndView.setViewName("questionsList");
        return modelAndView;
    }

    @GetMapping("/add")
    public String addQuestion(){
        return "addQuestion";
    }

    @PostMapping("/add")
    public ModelAndView addQuestion(Question question){
        questionService.saveQuestion(question);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addQuestion");
        return modelAndView;
    }

    @GetMapping("/id/{questionId}")
    public ModelAndView getQuestionById(@PathVariable("questionId") Long id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("questionView");
        modelAndView.addObject("question", questionService.getQuestionById(id));
        return modelAndView;
    }
}
