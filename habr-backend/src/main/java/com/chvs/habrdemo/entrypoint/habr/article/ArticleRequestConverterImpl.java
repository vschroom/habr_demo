package com.chvs.habrdemo.entrypoint.habr.article;

import com.chvs.habrdemo.core.habr.article.ArticleRequest;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
class ArticleRequestConverterImpl implements ArticleRequestConverter {

    @Override
    @NonNull
    public ArticleRequest createRequest(@NonNull CreateArticleRequest createArticleRequest) {
        return new ArticleRequest(createArticleRequest.header(), createArticleRequest.body());
    }
}
