package com.chvs.habrdemo.entrypoint.habr.article;

import com.chvs.habrdemo.core.habr.article.ArticleRequest;
import org.springframework.stereotype.Component;

@Component
class ArticleRequestMapperImpl implements ArticleRequestMapper {

    @Override
    public ArticleRequest createRequest(CreateArticleRequest createArticleRequest) {
        return new ArticleRequest(createArticleRequest.getHeader(), createArticleRequest.getBody());
    }
}
