package com.chvs.habrdemo.core.model.advertisement;

import com.chvs.habrdemo.core.exception.WebSocketSendMessageException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.List;

@Component
@RequiredArgsConstructor
class AdvertisementSenderImpl implements AdvertisementSender {

    private final List<WebSocketSession> webSocketSessions;

    @Override
    public void doSend(Advertisement advertisement) {
        webSocketSessions.forEach(session -> this.send(session, advertisement));
    }

    private void send(WebSocketSession session, Advertisement advertisement) {
        try {
            session.sendMessage(new TextMessage(advertisement.getBody()));
        } catch (IOException e) {
            throw new WebSocketSendMessageException(e);
        }
    }
}
