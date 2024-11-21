package com.chvs.habrdemo.entrypoint.habr.article;

import lombok.NonNull;
import org.apache.ibatis.annotations.Mapper;

@Mapper
interface ArticleResponseMapper {

    ArticleResponse findById(@NonNull Long id);
}
