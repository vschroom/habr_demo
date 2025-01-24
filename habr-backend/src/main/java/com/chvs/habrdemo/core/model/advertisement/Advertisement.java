package com.chvs.habrdemo.core.model.advertisement;

import lombok.Data;
import lombok.Setter;

import static lombok.AccessLevel.PACKAGE;

@Data
@Setter(value = PACKAGE)
public class Advertisement {

    private Long id;
    private String body;

    protected Advertisement(String body) {
        this.body = body;
    }
}
