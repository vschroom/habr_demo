package com.chvs.habrdemo.core.model.comment;

import lombok.NonNull;

public record ChildCommentCreationOperation(@NonNull Long parentCommentId, @NonNull String text) {
}
