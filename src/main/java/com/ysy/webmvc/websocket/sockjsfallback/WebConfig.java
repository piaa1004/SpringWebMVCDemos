package com.ysy.webmvc.websocket.sockjsfallback;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * SockJS Fallback.
 *
 * WebSocket 미지원 환경에서도 동작하도록 fallback transports (xhr-streaming, jsonp 등) 제공.
 * 클라이언트는 SockJS JS client 로 접속.
 */
@Configuration
@EnableWebSocket
public class WebConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(new com.ysy.webmvc.websocket.websocketapi.EchoHandler(), "/sockjs/echo")
                .withSockJS();
    }
}
