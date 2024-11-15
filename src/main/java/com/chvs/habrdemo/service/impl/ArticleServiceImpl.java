package com.chvs.habrdemo.service.impl;

import com.chvs.habrdemo.factory.ArticleFactory;
import com.chvs.habrdemo.model.dto.CreateArticleRequest;
import com.chvs.habrdemo.model.entity.Article;
import com.chvs.habrdemo.repository.ArticleRepository;
import com.chvs.habrdemo.service.ArticleService;
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
