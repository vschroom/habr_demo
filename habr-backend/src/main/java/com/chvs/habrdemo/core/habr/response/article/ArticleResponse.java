package com.chvs.habrdemo.core.habr.response.article;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ArticleResponse {

    private Long id;
    private LocalDateTime createdAt;
    private String header;
    private String body;
}
