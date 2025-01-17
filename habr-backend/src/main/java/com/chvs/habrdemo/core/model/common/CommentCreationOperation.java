package com.chvs.habrdemo.core.model.common;

import lombok.NonNull;

public record CommentCreationOperation(@NonNull Long articleId, @NonNull String text) {
}
