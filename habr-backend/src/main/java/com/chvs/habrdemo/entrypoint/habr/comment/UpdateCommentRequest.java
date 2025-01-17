package com.chvs.habrdemo.entrypoint.habr.comment;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NonNull;

@Schema(description = "Запрос на редактирование комментария")
record UpdateCommentRequest(@Schema(description = "Идентификатор комментария") @NonNull Long commentId,
                            @Schema(description = "Обновленный текст комментария") @NonNull String text) {
}
