package com.chvs.habrdemo.queries.articles.responses;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleResponseMapper {

    ArticleResponse findById(Long id);
}
