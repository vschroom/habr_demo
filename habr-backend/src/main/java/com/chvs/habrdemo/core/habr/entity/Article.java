package com.chvs.habrdemo.core.habr.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "articles")
@Entity

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Article {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "header")
    private String header;

    @Column(name = "body")
    private String body;
}
