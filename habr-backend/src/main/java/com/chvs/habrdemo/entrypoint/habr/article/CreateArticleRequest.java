package com.chvs.habrdemo.entrypoint.habr.article;

import lombok.Data;

@Data
class CreateArticleRequest {

    private String header;
    private String body;
}
