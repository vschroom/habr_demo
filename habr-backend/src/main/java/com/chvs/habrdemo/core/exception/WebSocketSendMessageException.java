package com.chvs.habrdemo.core.exception;

public class WebSocketSendMessageException extends HabrException {

    public WebSocketSendMessageException(Throwable cause) {
        super("Web socket send exception", cause);
    }
}
