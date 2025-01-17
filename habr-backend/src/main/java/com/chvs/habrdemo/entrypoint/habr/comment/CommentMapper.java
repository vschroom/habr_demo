package com.chvs.habrdemo.entrypoint.habr.comment;

import com.chvs.habrdemo.core.model.comment.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
interface CommentMapper {

    @Mapping(target = "parentId", source = "parentComment.id")
    CommentResponse map(Comment comment);
}
