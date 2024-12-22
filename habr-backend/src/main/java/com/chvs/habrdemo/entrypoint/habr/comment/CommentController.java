package com.chvs.habrdemo.entrypoint.habr.comment;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "CommentController", description = "Контроллер для действий с комментариями")
@RestController
@RequestMapping("api/v1/comments")
record CommentController(CommentResponseMapper commentResponseMapper) {

    @GetMapping("article/{articleId}")
    CommentResponses findAllParentBy(@PathVariable("articleId") Long articleId) {
        return new CommentResponses(commentResponseMapper.findAllParentBy(articleId));
    }

    @GetMapping("{id}")
    CommentResponses findAllByParent(@PathVariable("id") Long id) {
        return new CommentResponses(commentResponseMapper.findAllByParent(id));
    }
}
