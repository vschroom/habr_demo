package com.chvs.habrdemo.app;

import com.chvs.habrdemo.app.component.DateTimeComponent;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
record AppSdkImpl(@NonNull DateTimeComponent dateTimeComponent) implements AppSdk {
}
