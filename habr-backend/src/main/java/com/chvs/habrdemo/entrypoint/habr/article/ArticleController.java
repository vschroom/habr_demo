package com.chvs.habrdemo.entrypoint.habr.article;

import com.chvs.habrdemo.core.habr.article.ArticleCreatingOperation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "ArticleControllerV1", description = "Контроллер для действий со статьей")
@RestController
@RequestMapping("api/v1/articles")
@RequiredArgsConstructor
class ArticleController {

    private final ArticleCreatingOperation articleCreatingOperation;
    private final ArticleResponseMapper articleResponseMapper;
    private final ArticleRequestConverter articleRequestConverter;

    @Operation(description = "Получение статьи по идентификатору")
    @GetMapping("{id}")
    public ArticleResponse findBy(@Parameter(description = "Идентификатор статьи") @PathVariable("id") Long id) {
        return articleResponseMapper.findById(id);
    }

    @Operation(description = "Создание статьи")
    @PostMapping
    public ArticleResponse create(@Schema(description = "Запрос на создание статьи")
                                  @RequestBody CreateArticleRequest createArticleRequest) {
        var article = articleCreatingOperation.create(articleRequestConverter.createRequest(createArticleRequest));

        return articleResponseMapper.findById(article.getId());
    }
}
