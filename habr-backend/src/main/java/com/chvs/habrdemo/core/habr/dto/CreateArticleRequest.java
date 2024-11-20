package com.chvs.habrdemo.core.habr.dto;

import lombok.Data;

@Data
public class CreateArticleRequest {

    private String header;
    private String body;
}
