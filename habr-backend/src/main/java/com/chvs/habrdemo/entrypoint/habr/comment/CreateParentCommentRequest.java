package com.chvs.habrdemo.entrypoint.habr.comment;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NonNull;

@Schema(description = "Запрос на создание родительского комментария")
record CreateParentCommentRequest(@Schema(description = "Идентификатор статьи") @NonNull Long articleId,
                                  @Schema(description = "Текст комментария") @NonNull String text) {
}
