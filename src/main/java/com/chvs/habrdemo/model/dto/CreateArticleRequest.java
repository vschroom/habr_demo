package com.chvs.habrdemo.model.dto;

import lombok.Data;

@Data
public class CreateArticleRequest {

    private String header;
    private String body;
}
