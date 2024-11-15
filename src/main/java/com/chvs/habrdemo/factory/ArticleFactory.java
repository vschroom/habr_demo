package com.chvs.habrdemo.factory;

import com.chvs.habrdemo.components.LocalDateTimeComponent;
import com.chvs.habrdemo.model.dto.CreateArticleRequest;
import com.chvs.habrdemo.model.entity.Article;
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
