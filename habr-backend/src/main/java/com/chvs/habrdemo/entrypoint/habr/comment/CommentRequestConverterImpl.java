package com.chvs.habrdemo.entrypoint.habr.comment;

import com.chvs.habrdemo.core.model.comment.ChildCommentCreationOperation;
import com.chvs.habrdemo.core.model.comment.CommentDeletionOperation;
import com.chvs.habrdemo.core.model.comment.CommentModificationOperation;
import com.chvs.habrdemo.core.model.common.CommentCreationOperation;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Component
class CommentRequestConverterImpl implements CommentRequestConverter {

    @Override
    public @NonNull CommentCreationOperation fromRequest(@NonNull CreateParentCommentRequest commentRequest) {
        return new CommentCreationOperation(commentRequest.articleId(), commentRequest.text());
    }

    @Override
    public @NonNull ChildCommentCreationOperation fromRequest(@NonNull CreateChildCommentRequest commentRequest) {
        return new ChildCommentCreationOperation(commentRequest.parentCommentId(), commentRequest.text());
    }

    @Override
    public @NonNull CommentModificationOperation fromRequest(@NonNull UpdateCommentRequest commentRequest) {
        return new CommentModificationOperation(commentRequest.commentId(), commentRequest.text());
    }

    @Override
    public @NonNull CommentDeletionOperation fromRequest(@NonNull Long commentId) {
        return new CommentDeletionOperation(commentId);
    }
}
