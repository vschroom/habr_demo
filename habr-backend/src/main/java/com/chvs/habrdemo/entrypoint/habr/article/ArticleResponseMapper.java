package com.chvs.habrdemo.entrypoint.habr.article;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleResponseMapper {

    ArticleResponse findById(Long id);
}
