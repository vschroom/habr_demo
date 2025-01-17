package com.chvs.habrdemo.core.model.article;

import com.chvs.habrdemo.app.AppSdk;
import com.chvs.habrdemo.core.base.BaseReadonlyServiceImpl;
import lombok.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
class ArticleServiceImpl extends BaseReadonlyServiceImpl<Article, ArticleRepository> implements ArticleService {

    private final AppSdk appSdk;

    public ArticleServiceImpl(ArticleRepository repository, AppSdk appSdk) {
        super(repository);
        this.appSdk = appSdk;
    }

    @NonNull
    @Override
    @Transactional
    public Article create(@NonNull ArticleCreationOperation articleCreationOperation) {
        var article = Article.create(articleCreationOperation, appSdk.dateTimeComponent().now());

        return repository.save(article);
    }

    @Override
    public Optional<Article> findBy(@NonNull Long id) {
        return super.findById(id);
    }

    @Override
    public @NonNull Article getBy(@NonNull Long id) {
        return super.getById(id);
    }
}
