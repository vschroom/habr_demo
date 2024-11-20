package com.chvs.habrdemo.core.habr.factory;

import com.chvs.habrdemo.app.components.LocalDateTimeComponent;
import com.chvs.habrdemo.core.habr.dto.CreateArticleRequest;
import com.chvs.habrdemo.core.habr.entity.Article;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
public record ArticleFactory(LocalDateTimeComponent localDateTimeComponent) {

    public Article create(@NonNull CreateArticleRequest articleRequest) {
        return Article.builder()
                .createdAt(localDateTimeComponent.now())
                .header(articleRequest.getHeader())
                .body(articleRequest.getBody())
                .build();
    }
}
