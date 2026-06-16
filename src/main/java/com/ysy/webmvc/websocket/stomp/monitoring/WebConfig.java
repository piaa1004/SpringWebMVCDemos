package com.ysy.webmvc.websocket.stomp.monitoring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * STOMP > Monitoring.
 *
 * WebSocketMessageBrokerStats 빈이 자동 등록되어 통계 (subscriptions / sessions / message count) 제공.
 */
@Configuration
@EnableWebSocketMessageBroker
@ComponentScan(basePackageClasses = StatsController.class)
public class WebConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws-stats");
    }
}
