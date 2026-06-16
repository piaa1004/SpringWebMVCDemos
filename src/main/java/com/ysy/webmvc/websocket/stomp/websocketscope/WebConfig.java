package com.ysy.webmvc.websocket.stomp.websocketscope;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * STOMP > WebSocket Scope.
 *
 * "websocket" scope 는 Spring 의 STOMP infrastructure({@code SubProtocolWebSocketHandler})가 자동 등록한다.
 * 따라서 @EnableWebSocketMessageBroker 가 있는 한 별도 CustomScopeConfigurer 가 필요 없다.
 *
 * 일반 빈에서 다음과 같이 사용:
 *   {@code @Component @Scope(value = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)}
 *
 * 빈은 WebSocket 세션 동안 살아있다가 세션 종료와 함께 사라진다.
 */
@Configuration
@EnableWebSocketMessageBroker
@ComponentScan(basePackageClasses = ScopedController.class)
public class WebConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws-scope");
    }
}
