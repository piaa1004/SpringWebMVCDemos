package com.ysy.webmvc.websocket.stomp.enable;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * STOMP > Enable STOMP.
 *
 * {@code @EnableWebSocketMessageBroker} + {@link WebSocketMessageBrokerConfigurer} 가 STOMP 활성화의
 * 진입점. 두 가지 설정이 핵심:
 *   - registerStompEndpoints : 클라이언트가 접속할 WebSocket endpoint (/ws-enable) 정의
 *   - configureMessageBroker : in-memory simple broker 와 app prefix 정의
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws-enable");
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");
        registry.setApplicationDestinationPrefixes("/app");
    }
}
