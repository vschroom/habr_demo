package com.chvs.habrdemo.core.exception;

import lombok.NonNull;

public class EntityNotExistsException extends HabrException {

    public EntityNotExistsException(@NonNull Long id) {
        super("Entity with id = %s not exists".formatted(id));
    }
}
