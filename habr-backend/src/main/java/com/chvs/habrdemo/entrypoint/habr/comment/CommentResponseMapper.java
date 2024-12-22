package com.chvs.habrdemo.entrypoint.habr.comment;

import lombok.NonNull;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
interface CommentResponseMapper {

    List<CommentResponse> findAllParentBy(@NonNull Long articleId);

    List<CommentResponse> findAllByParent(@NonNull Long id);
}
