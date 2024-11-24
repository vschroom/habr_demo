package com.chvs.habrdemo.core.model.article;

import lombok.NonNull;

public record ArticleCreationOperation(@NonNull String header, @NonNull String body) {
}
