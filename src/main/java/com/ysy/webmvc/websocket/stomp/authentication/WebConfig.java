package com.ysy.webmvc.websocket.stomp.authentication;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * STOMP > Authentication.
 *
 * HTTP handshake 단계의 인증은 일반 Spring Security 흐름 (SecurityFilterChain). STOMP 메시지에
 * Principal 을 연결하는 것이 본 토픽의 포인트. 여기서는 시연을 위해 sessionAttributes 에
 * "user" 를 미리 채워두는 정도로 간략화.
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws-auth");
    }
}
