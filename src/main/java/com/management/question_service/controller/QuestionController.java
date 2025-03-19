package com.management.question_service.controller;

import com.management.question_service.model.Question;
import com.management.question_service.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }
    @PostMapping("/add")
    public ResponseEntity<String> saveQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }
}
