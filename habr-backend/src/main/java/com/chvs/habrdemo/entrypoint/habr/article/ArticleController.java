package com.chvs.habrdemo.entrypoint.habr.article;

import com.chvs.habrdemo.core.habr.article.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("articles")
@RequiredArgsConstructor
class ArticleController {

    private final ArticleService articleService;
    private final ArticleResponseMapper articleResponseMapper;
    private final ArticleRequestMapper articleRequestMapper;

    @GetMapping("{id}")
    public ArticleResponse findBy(@PathVariable("id") Long id) {
        return articleResponseMapper.findById(id);
    }

    @PostMapping
    public ArticleResponse create(@RequestBody CreateArticleRequest createArticleRequest) {
        var article = articleService.create(articleRequestMapper.createRequest(createArticleRequest));

        return articleResponseMapper.findById(article.getId());
    }
}
