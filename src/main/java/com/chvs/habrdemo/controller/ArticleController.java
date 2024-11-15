package com.chvs.habrdemo.controller;

import com.chvs.habrdemo.model.dto.CreateArticleRequest;
import com.chvs.habrdemo.queries.articles.responses.ArticleResponse;
import com.chvs.habrdemo.queries.articles.responses.ArticleResponseMapper;
import com.chvs.habrdemo.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("articles")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;
    private final ArticleResponseMapper articleResponseMapper;

    @GetMapping("{id}")
    public ArticleResponse findBy(@PathVariable("id") Long id) {
        return articleResponseMapper.findById(id);
    }

    @PostMapping
    public ArticleResponse create(@RequestBody CreateArticleRequest articleRequest) {
        var article = articleService.create(articleRequest);

        return articleResponseMapper.findById(article.getId());
    }
}
