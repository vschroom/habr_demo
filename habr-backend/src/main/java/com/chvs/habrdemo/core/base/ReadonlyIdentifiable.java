package com.chvs.habrdemo.core.base;

import lombok.NonNull;

public interface ReadonlyIdentifiable {

    /**
     * Получить идентификатор.
     * @return Идентификатор.
     */
    @NonNull
    Long getId();
}
