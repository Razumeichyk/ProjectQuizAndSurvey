package com.QuizAndSurvey.repository;

import com.QuizAndSurvey.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, String> {
}
