package com.chvs.habrdemo.app.components;

import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
class LocalDateTimeComponentImpl implements LocalDateTimeComponent {

    @Override
    @NonNull
    public LocalDateTime now() {
        return LocalDateTime.now();
    }
}
