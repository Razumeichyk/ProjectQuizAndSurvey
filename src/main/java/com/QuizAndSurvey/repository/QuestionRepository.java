package com.QuizAndSurvey.repository;

import com.QuizAndSurvey.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
