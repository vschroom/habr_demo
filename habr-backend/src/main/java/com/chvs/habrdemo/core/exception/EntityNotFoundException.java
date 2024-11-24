package com.chvs.habrdemo.core.exception;

import lombok.NonNull;

public class EntityNotFoundException extends HabrException {

    public EntityNotFoundException(@NonNull Long id) {
        super("Entity with id = %s not found".formatted(id));
    }
}
