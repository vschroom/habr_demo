package com.chvs.habrdemo.app;

import com.chvs.habrdemo.app.component.DateTimeComponent;
import lombok.NonNull;

public interface AppSdk {

    @NonNull
    DateTimeComponent dateTimeComponent();
}
