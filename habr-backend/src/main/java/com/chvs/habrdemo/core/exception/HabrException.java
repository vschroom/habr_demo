package com.chvs.habrdemo.core.exception;

class HabrException extends RuntimeException {

    public HabrException(String message) {
        super(message);
    }

    public HabrException(String message, Throwable cause) {
        super(message, cause);
    }
}
