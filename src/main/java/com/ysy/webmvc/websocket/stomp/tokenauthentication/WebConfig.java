package com.ysy.webmvc.websocket.stomp.tokenauthentication;

import java.security.Principal;
import java.util.UUID;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.stomp.StompCommand;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.messaging.support.MessageHeaderAccessor;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.messaging.simp.config.ChannelRegistration;

/**
 * STOMP > Token Authentication.
 *
 * CONNECT 프레임의 native header 에서 Authorization Bearer 토큰을 추출해 Principal 을 세팅.
 * 검증/사용자 매핑 로직은 토이로 대체.
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws-token");
    }

    @Override
    public void configureClientInboundChannel(ChannelRegistration registration) {
        registration.interceptors(new TokenInterceptor());
    }

    @Order(Ordered.HIGHEST_PRECEDENCE + 99)
    static class TokenInterceptor implements ChannelInterceptor {
        @Override
        public Message<?> preSend(Message<?> message, MessageChannel channel) {
            StompHeaderAccessor accessor = MessageHeaderAccessor.getAccessor(message, StompHeaderAccessor.class);
            if (accessor != null && StompCommand.CONNECT.equals(accessor.getCommand())) {
                String auth = accessor.getFirstNativeHeader("Authorization");
                if (auth != null && auth.startsWith("Bearer ")) {
                    final String name = "user-" + UUID.nameUUIDFromBytes(auth.getBytes()).toString().substring(0, 6);
                    accessor.setUser((Principal) () -> name);
                }
            }
            return message;
        }
    }
}
