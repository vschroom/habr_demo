package com.chvs.habrdemo.core.model.comment;

import lombok.NonNull;

record CommentModificationOperation(@NonNull Long commentId, @NonNull String text) {
}