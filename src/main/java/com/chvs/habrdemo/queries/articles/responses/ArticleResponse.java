package com.chvs.habrdemo.queries.articles.responses;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ArticleResponse {

    private Long id;
    private LocalDateTime createdAt;
    private String header;
    private String body;
}
