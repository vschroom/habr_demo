package com.chvs.habrdemo.core.model.article;

import lombok.NonNull;

public interface ArticleService {

    @NonNull
    Article create(@NonNull ArticleCreationOperation articleCreationOperation);
}
