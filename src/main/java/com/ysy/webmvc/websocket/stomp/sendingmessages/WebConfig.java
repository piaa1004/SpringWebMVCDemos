package com.ysy.webmvc.websocket.stomp.sendingmessages;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * STOMP > Sending Messages.
 *
 * 핸들러 외부(예: 일반 REST 컨트롤러 / 스케줄러)에서 SimpMessagingTemplate 으로 메시지를 보낼 수 있다.
 */
@Configuration
@EnableWebSocketMessageBroker
@ComponentScan(basePackageClasses = PushController.class)
public class WebConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws-send");
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");
        registry.setApplicationDestinationPrefixes("/app");
    }
}
