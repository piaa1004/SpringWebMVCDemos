package com.ysy.webmvc.websocket.stomp.events;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * STOMP > Application Context Events.
 *
 * Spring 이 발행하는 SessionConnect/Connected/Subscribe/Unsubscribe/Disconnect 이벤트를 받아 모니터링.
 */
@Configuration
@EnableWebSocketMessageBroker
@ComponentScan(basePackageClasses = SessionEventListener.class)
public class WebConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws-events");
    }
}
