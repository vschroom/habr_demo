package com.chvs.habrdemo.core.model.article;

import lombok.NonNull;

import java.util.Optional;

public interface ArticleService {

    @NonNull
    Article create(@NonNull ArticleCreationOperation articleCreationOperation);

    Optional<Article> findBy(@NonNull Long id);

    @NonNull
    Article getBy(@NonNull Long id);
}
