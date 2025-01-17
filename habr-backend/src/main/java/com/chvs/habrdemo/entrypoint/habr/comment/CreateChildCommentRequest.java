package com.chvs.habrdemo.entrypoint.habr.comment;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NonNull;

@Schema(description = "Запрос на создание вложенного комментария")
record CreateChildCommentRequest(@Schema(description = "Идентификатор родителя") @NonNull Long parentCommentId,
                                 @Schema(description = "Текст комментария") @NonNull String text) {
}
