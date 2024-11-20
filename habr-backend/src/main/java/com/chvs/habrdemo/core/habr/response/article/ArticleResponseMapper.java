package com.chvs.habrdemo.core.habr.response.article;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleResponseMapper {

    ArticleResponse findById(Long id);
}
