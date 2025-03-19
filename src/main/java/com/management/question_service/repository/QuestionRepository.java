package com.management.question_service.repository;

import com.management.question_service.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);

    @Query(value = "select q.id from questions q where q.category = :category order by random() limit :numQ", nativeQuery = true)
    List<Integer> findRandomQuestionsByCategory(String categoryName, Integer numQ);
}
