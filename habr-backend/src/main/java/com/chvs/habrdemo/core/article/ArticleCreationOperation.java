package com.chvs.habrdemo.core.article;

import lombok.NonNull;

public record ArticleCreationOperation(@NonNull String header, @NonNull String body) {
}
