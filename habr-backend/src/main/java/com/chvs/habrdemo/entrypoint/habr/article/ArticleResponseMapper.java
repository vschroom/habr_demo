package com.chvs.habrdemo.entrypoint.habr.article;

import org.apache.ibatis.annotations.Mapper;

@Mapper
interface ArticleResponseMapper {

    ArticleResponse findById(Long id);
}
