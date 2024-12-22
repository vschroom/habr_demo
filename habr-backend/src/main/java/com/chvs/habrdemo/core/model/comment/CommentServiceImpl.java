package com.chvs.habrdemo.core.model.comment;

import com.chvs.habrdemo.app.AppSdk;
import com.chvs.habrdemo.core.base.BaseReadonlyServiceImpl;
import lombok.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
class CommentServiceImpl extends BaseReadonlyServiceImpl<Comment, CommentRepository> implements CommentService {

    private final AppSdk appSdk;

    CommentServiceImpl(CommentRepository repository, AppSdk appSdk) {
        super(repository);
        this.appSdk = appSdk;
    }

    @Override
    @Transactional
    public @NonNull Comment create(@NonNull CommentCreationOperation creationOperation) {
        var dateTimeComponent = appSdk.dateTimeComponent();
        var comment = Comment.create(creationOperation, dateTimeComponent.now());

        return repository.save(comment);
    }

    @Override
    @Transactional
    public @NonNull Comment update(@NonNull CommentModificationOperation modificationOperation) {
        var comment = super.getById(modificationOperation.commentId());

        comment.setText(modificationOperation.text());
        comment.setModifiedAt(appSdk.dateTimeComponent().now());

        return comment;
    }

    @Override
    @Transactional
    public void delete(@NonNull CommentDeletionOperation deletionOperation) {
        repository.deleteById(deletionOperation.commentId());
    }
}
