package com.ysy.webmvc.websocket.stomp.dotseparators;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.util.AntPathMatcher;

/**
 * STOMP > Dots as Separators.
 *
 * destination 의 separator 를 / 가 아닌 . 으로 사용해 (예: red.thing) {var} 등 매칭이 자연스럽게.
 */
@Configuration
@EnableWebSocketMessageBroker
@ComponentScan(basePackageClasses = ColorController.class)
public class WebConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws-dots");
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");
        registry.setApplicationDestinationPrefixes("/app");
        registry.setPathMatcher(new AntPathMatcher("."));
    }
}
