package com.ysy.webmvc.websocket.stomp.externalbroker;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * STOMP > External Broker (RabbitMQ / ActiveMQ).
 *
 * enableStompBrokerRelay 로 외부 메시징 시스템에 STOMP 프레임을 relay. 실제 동작을 보려면
 * localhost:61613 에 STOMP 가 지원되는 broker (RabbitMQ + stomp plugin 등) 가 떠 있어야 함.
 * 본 데모는 설정 패턴만 보여줌.
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws-relay");
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableStompBrokerRelay("/topic", "/queue")
                .setRelayHost("localhost")
                .setRelayPort(61613)
                .setClientLogin("guest")
                .setClientPasscode("guest")
                .setSystemLogin("guest")
                .setSystemPasscode("guest");
        registry.setApplicationDestinationPrefixes("/app");
    }
}
