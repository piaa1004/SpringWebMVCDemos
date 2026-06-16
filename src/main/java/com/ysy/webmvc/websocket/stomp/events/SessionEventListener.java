package com.ysy.webmvc.websocket.stomp.events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
public class SessionEventListener {

    @EventListener
    public void onConnect(SessionConnectedEvent event) {
        System.out.println("[STOMP] connected " + event.getUser());
    }

    @EventListener
    public void onDisconnect(SessionDisconnectEvent event) {
        System.out.println("[STOMP] disconnected " + event.getSessionId());
    }
}
