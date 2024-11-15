package com.chvs.habrdemo.service;

import com.chvs.habrdemo.model.dto.CreateArticleRequest;
import com.chvs.habrdemo.model.entity.Article;

public interface ArticleService {

    Article create(CreateArticleRequest articleRequest);
}
