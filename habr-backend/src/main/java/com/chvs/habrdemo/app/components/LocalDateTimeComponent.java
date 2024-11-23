package com.chvs.habrdemo.app.components;

import lombok.NonNull;

import java.time.LocalDateTime;

public interface LocalDateTimeComponent {

    @NonNull
    LocalDateTime now();
}
