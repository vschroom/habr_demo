package com.chvs.habrdemo.entrypoint.habr.comment;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(description = "Информация о комментарии")
class CommentResponse {

    @Schema(description = "Идентификатор комментария")
    private Long id;
    @Schema(description = "Родительский комментарий")
    private Long parentId;
    @Schema(description = "Дата создания комментария")
    private LocalDateTime createdAt;
    @Schema(description = "Рэйтинг")
    private int rating;
    @Schema(description = "Текст комментария")
    private String text;
    @Schema(description = "Дата изменения комментария")
    private LocalDateTime modifiedAt;
}
