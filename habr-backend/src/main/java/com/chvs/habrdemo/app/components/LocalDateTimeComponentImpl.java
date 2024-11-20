package com.chvs.habrdemo.app.components;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class LocalDateTimeComponentImpl implements LocalDateTimeComponent {

    @Override
    public LocalDateTime now() {
        return LocalDateTime.now();
    }
}
