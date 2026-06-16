package com.ysy.webmvc.websocket.stomp.simplebroker;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * STOMP > Simple Broker.
 *
 * 인-메모리 simple broker — RabbitMQ/ActiveMQ 없이도 STOMP messaging 가능. 단점:
 *  - 단일 노드 한정 (클러스터링 X)
 *  - 메시지 영속성/ACK 없음.
 *  - 학습/내부 데모용.
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws-sb");
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic", "/queue")
                .setHeartbeatValue(new long[] { 10000, 10000 });
        registry.setApplicationDestinationPrefixes("/app");
    }
}
