package com.ysy.webmvc.websocket.stomp.stompclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.messaging.WebSocketStompClient;
import org.springframework.messaging.converter.StringMessageConverter;

/**
 * STOMP > STOMP Client.
 *
 * Spring 측에서도 STOMP 클라이언트를 만들 수 있다. 다른 STOMP 서버에 connect / send / subscribe.
 */
@Configuration
public class WebConfig {

    @Bean
    public WebSocketStompClient stompClient() {
        WebSocketClient ws = new StandardWebSocketClient();
        WebSocketStompClient client = new WebSocketStompClient(ws);
        client.setMessageConverter(new StringMessageConverter());
        return client;
    }
}
