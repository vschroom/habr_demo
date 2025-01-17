package com.chvs.habrdemo.core.model.common;

import com.chvs.habrdemo.core.model.article.ArticleService;
import com.chvs.habrdemo.core.model.comment.Comment;
import com.chvs.habrdemo.core.model.comment.CommentService;
import com.chvs.habrdemo.core.model.comment.ParentCommentCreationOperation;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
class ArticlePerCommentServiceImpl implements ArticlePerCommentService {

    private final ArticleService articleService;
    private final CommentService commentService;

    @Override
    @Transactional
    public @NonNull Comment createParentComment(@NonNull CommentCreationOperation creationOperation) {
        var article = articleService.getBy(creationOperation.articleId());
        var parentCreationOperation = new ParentCommentCreationOperation(article, creationOperation.text());

        return commentService.create(parentCreationOperation);
    }
}
