package com.ysy.webmvc.websocket.stomp.websockettransport;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketTransportRegistration;

/**
 * STOMP > WebSocket Transport (server-config).
 *
 * 전송 계층 파라미터를 조정. {@link WebSocketTransportRegistration#setMessageSizeLimit} 등.
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws-transport");
    }

    @Override
    public void configureWebSocketTransport(WebSocketTransportRegistration registration) {
        registration.setMessageSizeLimit(128 * 1024);     // 128 KB inbound payload
        registration.setSendBufferSizeLimit(512 * 1024);  // 512 KB session send buffer
        registration.setSendTimeLimit(15_000);
    }
}
