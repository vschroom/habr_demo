package com.chvs.habrdemo.core.base;

import lombok.NonNull;

import java.util.Optional;

public interface ReadonlyService<E> {

    E getById(@NonNull Long id);

    Optional<E> findById(@NonNull Long id);
}
