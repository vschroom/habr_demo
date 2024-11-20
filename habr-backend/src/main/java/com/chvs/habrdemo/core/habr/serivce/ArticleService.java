package com.chvs.habrdemo.core.habr.serivce;

import com.chvs.habrdemo.core.habr.dto.CreateArticleRequest;
import com.chvs.habrdemo.core.habr.entity.Article;

public interface ArticleService {

    Article create(CreateArticleRequest articleRequest);
}
