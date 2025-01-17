package com.chvs.habrdemo.entrypoint.habr.comment;

import com.chvs.habrdemo.core.model.comment.CommentService;
import com.chvs.habrdemo.core.model.common.ArticlePerCommentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "CommentController", description = "Контроллер для действий с комментариями")
@RestController
@RequestMapping("api/v1/articles")
record CommentController(CommentResponseMapper commentResponseMapper,
                         CommentRequestConverter commentRequestConverter,
                         CommentMapper commentMapper,
                         ArticlePerCommentService articlePerCommentService,
                         CommentService commentService) {

    @Operation(description = "Запрос на создание родительского комментария")
    @PostMapping("comments")
    CommentResponse createParent(@RequestBody CreateParentCommentRequest commentRequest) {
        var commentCreationOperation = commentRequestConverter.fromRequest(commentRequest);
        var parentComment = articlePerCommentService.createParentComment(commentCreationOperation);

        return commentMapper.map(parentComment);
    }

    @Operation(description = "Запрос на создание вложенного комментария")
    @PostMapping("comments/fork")
    CommentResponse createChild(@RequestBody CreateChildCommentRequest commentRequest) {
        var commentCreationOperation = commentRequestConverter.fromRequest(commentRequest);
        var childComment = commentService.forkComment(commentCreationOperation);

        return commentMapper.map(childComment);
    }

    @Operation(description = "Запрос на редактирование комментария")
    @PutMapping("comments")
    CommentResponse update(@RequestBody UpdateCommentRequest commentRequest) {
        var commentModificationOperation = commentRequestConverter.fromRequest(commentRequest);
        var comment = commentService.update(commentModificationOperation);

        return commentMapper.map(comment);
    }

    @Operation(description = "Запрос на удаление комментария")
    @DeleteMapping("comments/{id}")
    void delete(@PathVariable("id") Long id) {
        var commentDeletionOperation = commentRequestConverter.fromRequest(id);

        commentService.delete(commentDeletionOperation);
    }

    @Operation(description = "Запрос на получения всех родительских комментариев статьи")
    @GetMapping("{articleId}/comments")
    CommentResponses findAllParentBy(@PathVariable("articleId") Long articleId) {
        return new CommentResponses(commentResponseMapper.findAllParentBy(articleId));
    }

    @Operation(description = "Запрос на получение всех вложенных комментариев родительского комментария")
    @GetMapping("comments/{id}")
    CommentResponses findAllByParent(@PathVariable("id") Long id) {
        return new CommentResponses(commentResponseMapper.findAllByParent(id));
    }
}
