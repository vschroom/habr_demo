package com.chvs.habrdemo.entrypoint.habr.comment;

import com.chvs.habrdemo.core.model.comment.ChildCommentCreationOperation;
import com.chvs.habrdemo.core.model.comment.CommentDeletionOperation;
import com.chvs.habrdemo.core.model.comment.CommentModificationOperation;
import com.chvs.habrdemo.core.model.common.CommentCreationOperation;
import lombok.NonNull;

interface CommentRequestConverter {

    @NonNull CommentCreationOperation fromRequest(@NonNull CreateParentCommentRequest commentRequest);

    @NonNull ChildCommentCreationOperation fromRequest(@NonNull CreateChildCommentRequest commentRequest);

    @NonNull CommentModificationOperation fromRequest(@NonNull UpdateCommentRequest commentRequest);

    @NonNull CommentDeletionOperation fromRequest(@NonNull Long commentId);
}
