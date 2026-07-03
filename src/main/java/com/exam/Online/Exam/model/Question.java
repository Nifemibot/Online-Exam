package com.exam.online.Exam.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10000)
    private String QuestionText;
    private String OptionA;
    private String OptionB;
    private String OptionC;
    private String OptionD;
    private String CorrectAnswer;
}