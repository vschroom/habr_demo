package com.chvs.habrdemo.core.model.common;

import com.chvs.habrdemo.core.model.comment.Comment;
import lombok.NonNull;

public interface ArticlePerCommentService {

    @NonNull
    Comment createParentComment(@NonNull CommentCreationOperation creationOperation);
}
