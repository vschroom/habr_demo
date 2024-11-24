package com.chvs.habrdemo.core.model.article;

import com.chvs.habrdemo.app.AppSdk;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;
    private final AppSdk appSdk;

    @NonNull
    @Override
    @Transactional
    public Article create(@NonNull ArticleCreationOperation articleCreationOperation) {
        var article = Article.create(articleCreationOperation, appSdk.dateTimeComponent().now());

        return articleRepository.save(article);
    }
}
