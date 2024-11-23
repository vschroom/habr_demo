package com.chvs.habrdemo.core.article;

import lombok.NonNull;

public interface ArticleService {

    @NonNull
    Article create(@NonNull ArticleCreationOperation articleCreationOperation);
}
