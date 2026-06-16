package com.ysy.webmvc.websocket.stomp.flowofmessages;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * STOMP > Flow of Messages.
 *
 * 클라이언트 → /app/<dest> → MessageHandler (컨트롤러 메서드) → SimpleBroker → /topic/<dest> → 구독자.
 * 본 패키지는 그 흐름을 한 컨트롤러 + simple broker 로 보여준다.
 */
@Configuration
@EnableWebSocketMessageBroker
@ComponentScan(basePackageClasses = ChatController.class)
public class WebConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws-flow");
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");
        registry.setApplicationDestinationPrefixes("/app");
    }
}
