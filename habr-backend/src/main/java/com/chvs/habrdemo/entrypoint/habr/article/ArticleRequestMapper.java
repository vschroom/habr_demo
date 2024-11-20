package com.chvs.habrdemo.entrypoint.habr.article;

import com.chvs.habrdemo.core.habr.article.ArticleRequest;

interface ArticleRequestMapper {

    ArticleRequest createRequest(CreateArticleRequest createArticleRequest);
}
