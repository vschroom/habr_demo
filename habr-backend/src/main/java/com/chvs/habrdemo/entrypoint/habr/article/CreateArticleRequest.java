package com.chvs.habrdemo.entrypoint.habr.article;

import lombok.Data;

@Data
public class CreateArticleRequest {

    private String header;
    private String body;
}
