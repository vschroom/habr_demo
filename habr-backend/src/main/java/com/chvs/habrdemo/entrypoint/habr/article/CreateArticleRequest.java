package com.chvs.habrdemo.entrypoint.habr.article;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Schema(description = "Запрос на создание статьи")
record CreateArticleRequest(@Schema(description = "Заголовок") @NotNull @NotBlank String header,
                            @Schema(description = "Тело") @NotNull @NotBlank String body) {
}
