package com.chvs.habrdemo.core.model.advertisement;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.List;

@RequiredArgsConstructor
public class AdvertisementWebSocketHandler extends TextWebSocketHandler {

    private final List<WebSocketSession> sessions;

    @Override
    public void afterConnectionEstablished(@NonNull WebSocketSession session) throws Exception {
        sessions.add(session);
        super.afterConnectionEstablished(session);
    }

    @Override
    public void afterConnectionClosed(@NonNull WebSocketSession session, @NonNull CloseStatus status) throws Exception {
        sessions.remove(session);
        super.afterConnectionClosed(session, status);
    }
}
