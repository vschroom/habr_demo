package com.chvs.habrdemo.app.component;

import lombok.NonNull;

import java.time.LocalDateTime;

public interface DateTimeComponent {

    @NonNull
    LocalDateTime now();
}
