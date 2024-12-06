package com.chvs.habrdemo.core.model.comment;

import lombok.NonNull;

public interface CommentService {

    @NonNull
    Comment create(@NonNull CommentCreationOperation creationOperation);

    @NonNull
    Comment update(@NonNull CommentModificationOperation modificationOperation);

    void delete(@NonNull CommentDeletionOperation deletionOperation);
}
