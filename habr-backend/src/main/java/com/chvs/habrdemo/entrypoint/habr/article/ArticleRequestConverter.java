package com.chvs.habrdemo.entrypoint.habr.article;

import com.chvs.habrdemo.core.model.article.ArticleCreationOperation;

interface ArticleRequestConverter {

    ArticleCreationOperation createRequest(CreateArticleRequest createArticleRequest);
}
