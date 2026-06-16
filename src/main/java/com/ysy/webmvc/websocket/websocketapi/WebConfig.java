package com.ysy.webmvc.websocket.websocketapi;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * WebSocket API — raw WebSocket (STOMP 없이) 핸들러를 endpoint 에 매핑.
 */
@Configuration
@EnableWebSocket
public class WebConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(new EchoHandler(), "/ws/echo");
    }
}
