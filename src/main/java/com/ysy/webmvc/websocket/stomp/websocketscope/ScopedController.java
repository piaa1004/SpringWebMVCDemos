package com.ysy.webmvc.websocket.stomp.websocketscope;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ScopedController {

    @MessageMapping("/scope/ping")
    @SendTo("/topic/scope")
    public String ping() {
        return "pong";
    }
}
