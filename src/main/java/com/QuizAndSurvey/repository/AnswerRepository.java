package com.QuizAndSurvey.repository;

import com.QuizAndSurvey.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {

//    public void update(Answer answer);
}
