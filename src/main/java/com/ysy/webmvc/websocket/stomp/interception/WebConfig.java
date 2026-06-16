package com.ysy.webmvc.websocket.stomp.interception;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * STOMP > Interception.
 *
 * inbound / outbound / broker channel 에 {@link ChannelInterceptor} 등록.
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws-intercept");
    }

    @Override
    public void configureClientInboundChannel(ChannelRegistration registration) {
        registration.interceptors(new LoggingInterceptor("INBOUND"));
    }

    @Override
    public void configureClientOutboundChannel(ChannelRegistration registration) {
        registration.interceptors(new LoggingInterceptor("OUTBOUND"));
    }

    static class LoggingInterceptor implements ChannelInterceptor {
        private final String tag;
        LoggingInterceptor(String tag) { this.tag = tag; }
        @Override public Message<?> preSend(Message<?> m, MessageChannel ch) {
            System.out.println("[" + tag + "] headers=" + m.getHeaders());
            return m;
        }
    }
}
