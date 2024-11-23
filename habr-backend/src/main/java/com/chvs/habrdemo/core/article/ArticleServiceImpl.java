package com.chvs.habrdemo.core.article;

import com.chvs.habrdemo.app.components.LocalDateTimeComponent;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;
    private final LocalDateTimeComponent localDateTimeComponent;

    @NonNull
    @Override
    @Transactional
    public Article create(@NonNull ArticleCreationOperation articleCreationOperation) {
        var article = Article.create(articleCreationOperation, localDateTimeComponent.now());

        return articleRepository.save(article);
    }
}
