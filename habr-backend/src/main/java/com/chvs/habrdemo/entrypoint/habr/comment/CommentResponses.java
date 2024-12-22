package com.chvs.habrdemo.entrypoint.habr.comment;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NonNull;

import java.util.List;

@Schema(description = "Коментарии")
@NonNull
record CommentResponses(@NonNull List<CommentResponse> comments) {
}
