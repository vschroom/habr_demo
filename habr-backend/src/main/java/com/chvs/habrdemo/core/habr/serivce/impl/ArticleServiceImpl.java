package com.chvs.habrdemo.core.habr.serivce.impl;

import com.chvs.habrdemo.core.habr.factory.ArticleFactory;
import com.chvs.habrdemo.core.habr.dto.CreateArticleRequest;
import com.chvs.habrdemo.core.habr.entity.Article;
import com.chvs.habrdemo.core.habr.repository.ArticleRepository;
import com.chvs.habrdemo.core.habr.serivce.ArticleService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;
    private final ArticleFactory articleFactory;

    @Override
    @Transactional
    public Article create(@NonNull CreateArticleRequest articleRequest) {
        var article = articleFactory.create(articleRequest);

        return articleRepository.save(article);
    }
}
