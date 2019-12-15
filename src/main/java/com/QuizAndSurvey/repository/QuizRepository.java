package com.QuizAndSurvey.repository;

import com.QuizAndSurvey.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
