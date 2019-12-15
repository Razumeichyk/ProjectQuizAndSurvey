package com.QuizAndSurvey.controller;


import com.QuizAndSurvey.model.Answer;
import com.QuizAndSurvey.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @GetMapping
    public ModelAndView getAnswers(){
        List<Answer> answersList = answerService.getAnswers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("answers", answersList);
        modelAndView.setViewName("answersList");
        return modelAndView;
    }


//    @GetMapping("/update/answer")
//    public String updateAnswer(){
//        return "updateAnswer";
//    }
//
//    @PostMapping("/update/answer")
//    public ModelAndView updateAnswer(Answer answer){
//        answerService.updateAnswer(answer);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("updateAnswer");
//        return modelAndView;
//    }

    @GetMapping("/add")
    public String addAnswer(){
        return "addAnswer";
    }

    @PostMapping("/add")
    public ModelAndView addAnswer(Answer answer){
        answerService.saveAnswer(answer);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addAnswer");
        return modelAndView;
    }

    @GetMapping("/id/{answerId}")
    public ModelAndView getAnswerById(@PathVariable("answerId") Long id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("answerView");
        modelAndView.addObject("answer", answerService.getAnswerById(id));
        return modelAndView;
    }

//    @GetMapping
//    public ModelAndView firstAnswer(){
//        List<Answer> answerForFirstQuestion = answerService.getAnswers();
//        Answer answer = new Answer();
//        answer.getId();
//        answerForFirstQuestion.add(answer);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("displayAnswer", answerForFirstQuestion.get(0));
//        modelAndView.setViewName("quiz");
//        return modelAndView;
//    }
}
