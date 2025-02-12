package com.chvs.habrdemo.core.model.comment;

import com.chvs.habrdemo.core.model.article.Article;
import lombok.NonNull;

public record ParentCommentCreationOperation(@NonNull Article article, @NonNull String text) {
}
