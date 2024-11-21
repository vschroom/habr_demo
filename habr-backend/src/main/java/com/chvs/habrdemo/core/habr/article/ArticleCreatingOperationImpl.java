package com.chvs.habrdemo.core.habr.article;

import com.chvs.habrdemo.app.components.LocalDateTimeComponent;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
class ArticleCreatingOperationImpl implements ArticleCreatingOperation {

    private final ArticleRepository articleRepository;
    private final LocalDateTimeComponent localDateTimeComponent;

    @NonNull
    @Override
    @Transactional
    public Article create(@NonNull ArticleRequest articleRequest) {
        var article = Article.create(articleRequest, localDateTimeComponent.now());

        return articleRepository.save(article);
    }
}
