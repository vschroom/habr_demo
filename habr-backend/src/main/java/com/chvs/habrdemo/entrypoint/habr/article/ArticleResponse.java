package com.chvs.habrdemo.entrypoint.habr.article;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(description = "Информация о статье")
class ArticleResponse {

    @Schema(description = "Идентификатор статьи")
    private Long id;
    @Schema(description = "Дата создания")
    private LocalDateTime createdAt;
    @Schema(description = "Заголовок")
    private String header;
    @Schema(description = "Тело")
    private String body;
}
