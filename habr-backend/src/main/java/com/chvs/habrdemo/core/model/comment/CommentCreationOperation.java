package com.chvs.habrdemo.core.model.comment;

import com.chvs.habrdemo.core.model.article.Article;
import lombok.NonNull;

record CommentCreationOperation(@NonNull Article article, @NonNull String text, Comment parentComment) {
}
