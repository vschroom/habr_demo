package com.chvs.habrdemo.app.component;

import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
class DateTimeComponentImpl implements DateTimeComponent {

    @Override
    @NonNull
    public LocalDateTime now() {
        return LocalDateTime.now();
    }
}
