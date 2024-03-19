package com.jbground.community.question.repository;

import com.jbground.community.question.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
