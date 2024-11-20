package com.chvs.habrdemo.app.components;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class LocalDateTimeComponent {

    public LocalDateTime now() {
        return LocalDateTime.now();
    }
}