package com.chvs.habrdemo.core.habr.article;

import com.chvs.habrdemo.app.components.LocalDateTimeComponent;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;
    private final LocalDateTimeComponent localDateTimeComponent;

    @Override
    @Transactional
    public Article create(@NonNull ArticleRequest articleRequest) {
        var article = this.createArticle(articleRequest);

        return articleRepository.save(article);
    }

    private Article createArticle(ArticleRequest articleRequest) {
        return Article.builder()
                .createdAt(localDateTimeComponent.now())
                .header(articleRequest.getHeader())
                .body(articleRequest.getBody())
                .build();
    }
}
