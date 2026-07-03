package com.exam.online.Exam.model;

import jakarta.persistence."".*;
import lombok.Data;

@Data
@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @column(nullable = false)
    private String password;

    private String role;
}