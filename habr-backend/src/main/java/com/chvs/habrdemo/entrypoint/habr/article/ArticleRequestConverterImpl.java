package com.chvs.habrdemo.entrypoint.habr.article;

import com.chvs.habrdemo.core.model.article.ArticleCreationOperation;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
class ArticleRequestConverterImpl implements ArticleRequestConverter {

    @Override
    @NonNull
    public ArticleCreationOperation createRequest(@NonNull CreateArticleRequest createArticleRequest) {
        return new ArticleCreationOperation(createArticleRequest.header(), createArticleRequest.body());
    }
}
