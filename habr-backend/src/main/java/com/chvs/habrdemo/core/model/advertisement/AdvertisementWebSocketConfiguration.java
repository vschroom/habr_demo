package com.chvs.habrdemo.core.model.advertisement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketSession;

import java.util.ArrayList;
import java.util.List;

@Configuration
class AdvertisementWebSocketConfiguration {

    @Bean
    List<WebSocketSession> webSocketSessions() {
        return new ArrayList<>();
    }
}
